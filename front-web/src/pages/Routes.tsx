import React from 'react';
import { BrowserRouter, Switch, Route} from 'react-router-dom';
import Navbar from '../core/components/navbar';
import Admin from './Admin';
import Catalog from './Catalog';
import ProductDetails from './Catalog/components/ProductDetails';
import Home from './Home';

const Routes = () => (
    <BrowserRouter>
      <Navbar />
        <Switch>
            <Route path="/" exact>
                <Home />
            </Route>
            
            <Route path="/products" exact>
                <Catalog />
            </Route>

            <Route path="/products/:productId">
                <ProductDetails />
            </Route>

            <Route path="/admin">
                <Admin />
            </Route>
        </Switch>
    </BrowserRouter>

);

export default Routes;