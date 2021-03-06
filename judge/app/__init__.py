#!/usr/bin/env python3
# -*- coding: utf-8 -*-

from flask import Flask
from flask_cors import CORS
from config import config
from werkzeug.contrib.fixers import ProxyFix


def create_app(config_name):
    app = Flask(__name__)
    CORS(app)
    app.config.from_object(config[config_name])
    app.wsgi_app = ProxyFix(app.wsgi_app)
    config[config_name].init_app(app)
    from .api_1_0 import api as api_blueprint
    app.register_blueprint(api_blueprint)
    return app
