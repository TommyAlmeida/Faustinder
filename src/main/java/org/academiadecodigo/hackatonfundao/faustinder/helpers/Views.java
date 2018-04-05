package org.academiadecodigo.hackatonfundao.faustinder.helpers;

public enum Views {

    INITIAL_VIEW("InitialView"),
    CHAT_VIEW("ChatView"),
    FETISH_EDITOR("FetishEditor"),
    FETISH_SELECTOR("FetishSelector"),
    LOGIN_VIEW("LoginView"),
    REGISTER_VIEW("RegisterView"),
    RESULTS_VIEW("ResultsView"),
    SEARCHING_MATCHES("SearchingMatchesView"),
    SEARCH_VIEW("SearchView");

    String view;

    Views(String view) {
        this.view = view;
    }

    public String getView() {
        return view + ".fxml";
    }
}
