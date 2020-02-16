import Vue from 'vue';
import { Multiselect } from 'vue-multiselect';

import fontawesomeConfig from '@/shared/config/fontawesome-config';
import bootstrapVueConfig from '@/shared/config/bootstrap-vue-config';

import App from '@/app.vue';
import router from '@/app-routes';

fontawesomeConfig.init();
bootstrapVueConfig.init();
Vue.use(Multiselect);

Vue.config.productionTip = false;

new Vue({
  router,
  render: (h) => h(App),
}).$mount('#app');
