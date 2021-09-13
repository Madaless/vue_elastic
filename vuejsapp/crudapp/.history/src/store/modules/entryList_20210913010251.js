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
    await axios.delete(`https://jsonplaceholder.typicode.com/entries/${id}`);
    commit('removeEntry');
  },

  async addEntry({ commit }, entry) {
    const response = await axios.post(`http://localhost:8082/entries/`,
      entry);

    commit('addTodo', response.data)
  },

  async filterEntryList({ commit }, name, isActive) {
    const response = await axios.get('http://localhost:8082/entries/');
    console.log(response)

    commit('setEntryList', response.data.content);
  },
}

const mutations = {
  setEntryList: (state, entryList) => (state.entryList = entryList),
  removeEntry: (state, id) => state.entryList = state.entryList.filter((entry) => entry.id !== id),
  addEntry:(state,newEntry) => state.todos.unshift(newEntry)
};

export default {
  state,
  getters,
  actions,
  mutations
};