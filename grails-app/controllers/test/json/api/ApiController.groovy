package test.json.api

class ApiController {

    def index(String config) {
        render Author.all*.asJSON(config)
    }

    def show(Long id, String config) {
        render Author.api().get(config: config, id: id)
    }

    def list(String config) {
        render Author.api().list(config: config, max: params.max, offset: params.offset)
    }

    def delete(Long id) {
        render Author.api().delete(id: id, params: params)
    }

    def save(Long id, String config) {
        render Author.api().save(id: id, params: params, config: config)
    }

}
