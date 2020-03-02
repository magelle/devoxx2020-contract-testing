package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url ''
        headers {
            contentType(applicationJson())
        }
    }
    response {
        status OK()
        body("""
        [{
            "id": "d4d37e73-77a0-4616-8bd2-5ed983d45d14",
            "name": "Java",
            "price": "19.9",
            "stock": 100
        }]
        """)
        headers {
            contentType(applicationJson())
        }
    }
}