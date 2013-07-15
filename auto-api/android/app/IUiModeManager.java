package android.app;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

public interface IUiModeManager extends android.os.IInterface
{

public static abstract class Stub extends android.os.Binder implements android.app.IUiModeManager
{
private static final java.lang.String DESCRIPTOR = "android.app.IUiModeManager";

public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}

public static android.app.IUiModeManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.IUiModeManager))) {
return ((android.app.IUiModeManager)iin);
}
return new android.app.IUiModeManager.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_enableCarMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.enableCarMode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_disableCarMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.disableCarMode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getCurrentModeType:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getCurrentModeType();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setNightMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setNightMode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getNightMode:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getNightMode();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.IUiModeManager
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}

public void enableCarMode(int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_enableCarMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}

public void disableCarMode(int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_disableCarMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}

public int getCurrentModeType() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCurrentModeType, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}

public void setNightMode(int mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(mode);
mRemote.transact(Stub.TRANSACTION_setNightMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}

public int getNightMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getNightMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_enableCarMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_disableCarMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getCurrentModeType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setNightMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getNightMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}

public void enableCarMode(int flags) throws android.os.RemoteException;

public void disableCarMode(int flags) throws android.os.RemoteException;

public int getCurrentModeType() throws android.os.RemoteException;

public void setNightMode(int mode) throws android.os.RemoteException;

public int getNightMode() throws android.os.RemoteException;
}
