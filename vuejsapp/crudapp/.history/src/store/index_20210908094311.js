import Vuex from 'vuex';
import Vue from 'vue';
import entryList from './modules/entryList';

Vue.use(Vuex);

export default new Vuex.Store({
    modules: {
        entryList
    }
})