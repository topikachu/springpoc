FROM rabbitmq:3.6.8-management-alpine

ENV RABBITMQ_USE_LONGNAME=true \
    RABBITMQ_CONF_ENV_FILE=/etc/rabbitmq/rabbitmq-env.conf


COPY root/ /

RUN \
chown -R rabbitmq /var/lib/rabbitmq
