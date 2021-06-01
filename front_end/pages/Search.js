import React ,{ useState}from 'react';
import { StyleSheet, Text, TextInput, View,Button, Alert } from 'react-native';

export default function search({navigation}){
    
    const update =()=> { 
        navigation.navigate("Update");
    }
    
    return (
        <View style={styles.container}>
            
            <Text>id :</Text>
            <TextInput placeholder="id"/>
            <Button title="search" onPress={update}/>
   
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