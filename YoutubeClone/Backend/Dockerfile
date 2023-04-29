FROM node

COPY package.json package-lock.json /app/

COPY app/ /app/app/

COPY config/ /app/config/

COPY middleware/ /app/middleware/

COPY public/ /app/public/

COPY server.js /app/

WORKDIR /app

RUN npm install

EXPOSE 9002

CMD ["npm","start"]