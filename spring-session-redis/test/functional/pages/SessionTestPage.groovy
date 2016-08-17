package pages;

import geb.Page;

class SessionTestPage extends Page {

    static url = "/sessionTest/index"

    static at = {
        contains("SessionId:")
    }
}