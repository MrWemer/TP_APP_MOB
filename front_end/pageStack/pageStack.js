import {createStackNavigator} from 'react-navigation-stack';
import { createAppContainer } from 'react-navigation';
import Add from '../pages/Add';
import Home from '../pages/Home';
import Search from '../pages/Search';
import Delete from '../pages/Delete';
import Update from '../pages/Update';

const pages={
    Home :  Home ,
    Add :  Add,
    Search : Search,
    Delete : Delete ,
    Update : Update
};

const pageStack =  createStackNavigator(pages);

export default createAppContainer(pageStack); 