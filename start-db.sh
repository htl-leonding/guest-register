docker run --rm --name guest-db -e POSTGRES_USER=app \
           -e POSTGRES_PASSWORD=app -e POSTGRES_DB=db \
           -p 5432:5432 postgres:14