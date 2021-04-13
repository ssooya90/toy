import axios from 'axios';

// const isDev = process.env.NODE_ENV === 'development';
const Api = axios.create({
  baseURL: 'http://localhost:4000/',
  // baseURL: isDev ? 'http://localhost:4000/' : '/api/',
});

export default Api;