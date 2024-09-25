package com.example.myservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class RemoteService extends Service {

    private final IRemoteService.Stub mBinder = new IRemoteService.Stub() {
        @Override
        public int add(int a, int b) throws RemoteException {
            return a + b;
        }

        @Override
        public String getMessage() throws RemoteException {
            return "Hello from the service!";
        }
    };

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
}