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
    commit('setEntryList', response.data.content);
  },

  async deleteEntry({ commit }, id) {
    await axios.delete(`https://jsonplaceholder.typicode.com/todos/${id}`);
    commit('removeEntry', response.data.content);
  }
}

const mutations = {
    setEntryList: (state, entryList) => (state.entryList = entryList),
    removeEntry:(state,id) => state.entryList = state.entryList.filter((entry) => entry.id !== id)
};

export default {
    state,
    getters,
    actions,
    mutations
};