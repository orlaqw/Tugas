import 'package:flutter/material.dart';
import 'package:flutter/cupertino.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {  
  @override
  Widget build(BuildContext context) {  
    return MaterialApp( 
      home: Container(
        margin: EdgeInsets.only(top: 30),
        color: Colors.white,
        child: Column(
          children: <Widget>[
            AppBar(title: Text('Contoh Cuppertino')),
            CupertinoButton(
              child: Text("Contoh Button"),
              onPressed: (){},
            ),
            CupertinoActivityIndicator(),
            ],
          ),
        ),
      );
    } 
  }
