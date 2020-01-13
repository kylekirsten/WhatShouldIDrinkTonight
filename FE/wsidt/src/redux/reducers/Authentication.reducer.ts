//Importing the "actions"
import {
    LOGIN_SUCCESSFUL,
    TOGGLE_AUTH_STATUS,
    SET_REDIRECT,
    START_REDIRECT,
    FINISH_REDIRECT,
    LOGOUT,
  } from '../actions/Authentication.action';
  import * as index from './index';
//This defines the initial state in redux. It defines the state according to the interface it is based upon.
//In this case, IAuthState is defined in /reducers/index.ts. The initial state is the state that the application
//should have when the program begins and before any actions are called.
const initialState : index.IAuthState = {
    userProfile: null,
    isVerified : false,
    isFetching : false,

  }
  //This is an example of a reducer. This reducer, authReducer is designed to catch any actions that have to do
  //with authentication. It is called by the dispatch function, which is inside the action creators. It consists of
  //a switch statement which catches certain actions and modifies the state based upon the action.
  //* It is important to note that reducers are pure functions and state modification SHOULD BE the only thing happening
  //within the reducer function.
  export const authReducer = (state = initialState, action: any) => {
    switch(action.type) {
        case LOGIN_SUCCESSFUL:
            console.log(action.payload);
          return { ...state, userProfile : action.payload, isVerified: true, isFetching: false}
        case LOGOUT:
            return {...state, userProfile: initialState.userProfile}
        default: break;

    }
    return state;
}