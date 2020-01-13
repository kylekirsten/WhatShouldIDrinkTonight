import React from 'react';
import {Route, Switch, BrowserRouter} from 'react-router-dom';
import { Provider } from 'react-redux';
import store from './redux/Store';
import Landing from './components/Landing';
import './App.css';

const App: React.FC = () => {
  return (
    <Provider store={store}>
      <BrowserRouter>
        <Switch>
          {
            /* Insert routes here using <Route exact path = "" component = {}> 
              This should be the only switch in the application.
            */
          }
          <Route exact path="/" component={Landing} />
        </Switch>
      </BrowserRouter>
    </Provider>
  );
}

export default App;
