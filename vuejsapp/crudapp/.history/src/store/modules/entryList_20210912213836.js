import axios from 'axios';

const state = {
  entryList: []
};
// get the state
const getters = {
  entryList: (state) => {
    return state.entryList
  }
};

const actions = {
    // fetch from api
  async fetchEntryList({ commit }) {
    const response = await axios.get('http://localhost:8082/entries/');
    console.log(response)
    commit('setEntryList', response.data);
  }
}

const mutations = {
    setEntryList: (state, entryList) => (state.entryList = entryList)
};

export default {
    state,
    getters,
    actions,
    mutations
};