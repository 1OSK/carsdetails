#!/bin/bash

# Проверка, установлен ли Docker
if ! command -v docker &> /dev/null
then
    echo "Docker не найден, пожалуйста, установите Docker."
    exit 1
fi

# Проверка, установлен ли Docker Compose
if ! command -v docker-compose &> /dev/null
then
    echo "Docker Compose не найден, пожалуйста, установите Docker Compose."
    exit 1
fi

# Запуск Docker Compose для поднятия контейнера
echo "Запуск PostgreSQL с помощью Docker Compose..."

docker-compose up -d

# Проверка успешности запуска контейнера
if [ $? -eq 0 ]; then
    echo "PostgreSQL успешно запущен!"
else
    echo "Произошла ошибка при запуске контейнера."
    exit 1
fi