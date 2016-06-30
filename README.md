# Stetho Plugin for Android


Cordova plugin to integrate with [Stetho library](http://facebook.github.io/stetho/). Stetho is a debug bridge for Android applications. When enabled, developers have access to the Chrome Developer Tools feature natively part of the Chrome desktop browser. Developers can also choose to enable the optional dumpapp tool which offers a powerful command-line interface to application internals. 

## Plugin

The Stetho is initialized when the Cordova is initialized, so the only requirment to use the Stetho debug bridge is initialize the cordova in the Web Application. 

## Supported Platforms

 - Android 


## Installation
- Run the following command:

```shell
    cordova plugin add cordova-plugin-stetho-android 
``` 

## Features

- Chrome DevTools
- Network Inspection
- Database Inspection - SQLite databases can be visualized and interactively explored with full read/write capabilities.
- View Hierarchy
- Javascript Console - Javascript Console allows for execution of javascript code that can interact with the application or even the Android SDK. 

---

#### Contributors
- OutSystems - Mobility Experts
    - João Gonçalves, <joao.goncalves@outsystems.com>
    - Rúben Gonçalves, <ruben.goncalves@outsystems.com>
    - Vitor Oliveira, <vitor.oliveira@outsystems.com>

---

LICENSE
=======


[The MIT License (MIT)](http://www.opensource.org/licenses/mit-license.html)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
