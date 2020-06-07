localhost:8001/oauth/token <br>

Body => Form Data <br>
grant_type=password <br>
username=allen <br>
password=pass <br>

Basic Auth <br>
username mobile <br>
password pin <br>

Response <br>
{
    "access_token": "e406ea1c-5e26-4365-ad24-e3a4509129e0",
    "token_type": "bearer",
    "refresh_token": "dfdfbd48-eaa7-4c1b-983d-4984f1946515",
    "expires_in": 3599,
    "scope": "read write"
}

check token <br>
localhost:8001/oauth/check_token?token=e406ea1c-5e26-4365-ad24-e3a4509129e0
{
    "active": true,
    "exp": 1591344108,
    "user_name": "allen",
    "authorities": [
        "ROLE_ADMIN",
        "ROLE_USER"
    ],
    "client_id": "mobile",
    "scope": [
        "read",
        "write"
    ]
}