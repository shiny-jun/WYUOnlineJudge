package com.zoctan.api.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "admin_contest")
public class AdminContest {
    /**
     * 举办者Id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 比赛Id
     */
    @Id
    @Column(name = "contest_id")
    private Long contestId;
}