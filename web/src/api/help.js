import request from '@/utils/request'

export function list() {
  return request({
    url: '/help',
    method: 'get'
  })
}
