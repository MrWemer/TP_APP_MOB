
import React ,{ useState}from 'react';
import { StyleSheet, Text, TextInput, View,Button, Alert } from 'react-native';

export default function Add({navigation}){
    
    

    return (
        <View style={styles.container}>
            <Text>title :</Text> 
            <TextInput placeholder="title"/>
            <Text>author :</Text> 
            <TextInput placeholder="author"/>
            <Button title="add" />
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

   
});