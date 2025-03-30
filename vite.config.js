import { defineConfig } from 'vite';
import laravel from 'laravel-vite-plugin';
import vue from '@vitejs/plugin-vue';

// https://vitejs.dev/config/
export default defineConfig({
  server: {
    port: 3000,  
  },
  plugins: [
    laravel({
      input: 'resources/js/app.js', 
      refresh: true,
    }),
    vue(), 
  ],
  build: {
    rollupOptions: {
      input: 'resources/scss/main.scss',  
    },
  },
});




