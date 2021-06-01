import React ,{ useState}from 'react';
import { StyleSheet, Text, TextInput, View,Button, Alert } from 'react-native';

export default function Home({navigation}){

    const [test , settset] = useState("try");

    const gettest = ()=>{
    fetch('http://localhost:8080/')
      .then((response) => response.json())
      .then((json) => settest(json))
      .catch((error) => console.error(error))
      ;
    }

    const add =()=> { 
        navigation.navigate("Add");
    }
    const search =()=> { 
        navigation.navigate("Search");
    }
    const del =()=> { 
        navigation.navigate("Delete");
    }

    return (
        <View style={styles.container}>
            <Text>{test}</Text>
           <Button  title="show Books" onPress={gettest}/>
           <Button  title="add new Book"  onPress={add}/>
           <Button  title="update Book"   onPress={search} />
           <Button  title="delete book"   onPress={del}/>
       
   
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
      flex: 1,
      backgroundColor: '#fff',
      alignItems: 'center',
      justifyContent: 'center',
      
    },

    Button:{
        
    }
});