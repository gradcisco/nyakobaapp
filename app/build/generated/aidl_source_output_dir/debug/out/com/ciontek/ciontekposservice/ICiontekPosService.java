/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.ciontek.ciontekposservice;
// Declare any non-default types here with import statements

public interface ICiontekPosService extends android.os.IInterface
{
  /** Default implementation for ICiontekPosService. */
  public static class Default implements com.ciontek.ciontekposservice.ICiontekPosService
  {
    /*--------------------------------Android OS Interface ----------------------------------------*///1.0.1

    @Override public int installRomPackage(java.lang.String romFilePath) throws android.os.RemoteException
    {
      return 0;
    }
    //1.0.2

    @Override public java.lang.String getOSVersion() throws android.os.RemoteException
    {
      return null;
    }
    //1.0.3

    @Override public java.lang.String getDeviceId() throws android.os.RemoteException
    {
      return null;
    }
    /*--------------------------------Peripheral Interface ----------------------------------------*///2.0.1

    @Override public int Lib_LogSwitch(int LogSwitch) throws android.os.RemoteException
    {
      return 0;
    }
    //2.0.2

    @Override public int Lib_GetRand(byte[] rnd) throws android.os.RemoteException
    {
      return 0;
    }
    //2.0.3

    @Override public int Lib_Update_32550() throws android.os.RemoteException
    {
      return 0;
    }
    //2.0.4

    @Override public int Lib_GetVersion(byte[] buf) throws android.os.RemoteException
    {
      return 0;
    }
    //2.0.5

    @Override public int Lib_ReadSN(byte[] SN) throws android.os.RemoteException
    {
      return 0;
    }
    //2.0.6

    @Override public int Lib_WriteSN(byte[] SN) throws android.os.RemoteException
    {
      return 0;
    }
    //2.0.7

    @Override public int Lib_ReadChipID(byte[] buf, int len) throws android.os.RemoteException
    {
      return 0;
    }
    /*--------------------------------IC card ---------------------------------------------------*///3.0.1

    @Override public int Lib_IccOpen(byte slot, byte vccMode, byte[] atr) throws android.os.RemoteException
    {
      return 0;
    }
    //3.0.2

    @Override public int Lib_IccClose(byte slot) throws android.os.RemoteException
    {
      return 0;
    }
    //3.0.3

    @Override public int Lib_IccCommand(byte slot, byte[] apduSend, byte[] apduResp) throws android.os.RemoteException
    {
      return 0;
    }
    //3.0.4

    @Override public int Lib_IccCheck(byte slot) throws android.os.RemoteException
    {
      return 0;
    }
    //3.0.5

    @Override public int SC_ApduCmd(byte bslot, byte[] pbInApdu, int usInApduLen, byte[] pbOut, byte[] pbOutLen) throws android.os.RemoteException
    {
      return 0;
    }
    /*--------------------------------    printer      --------------------------------------------*///7.0.1

    @Override public int Lib_PrnInit() throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.2

    @Override public int Lib_PrnSetSpace(byte x, byte y) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.3

    @Override public int Lib_PrnSetFont(byte AsciiFontHeight, byte ExtendFontHeight, byte Zoom) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.4

    @Override public int Lib_PrnGetFont(byte[] AsciiFontHeight, byte[] ExtendFontHeight, byte[] Zoom) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.5

    @Override public int Lib_PrnStep(int pixel) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.6

    @Override public int Lib_PrnSetVoltage(int voltage) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.7

    @Override public int Lib_PrnIsCharge(int ischarge) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.8

    @Override public int Lib_PrnStr(java.lang.String str) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.9

    @Override public int Lib_PrnBmp(android.graphics.Bitmap bitmap) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.10

    @Override public int Lib_PrnBarcode(java.lang.String contents, int desiredWidth, int desiredHeight, java.lang.String barcodeType) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.11

    @Override public int Lib_PrintCutQrCode(java.lang.String contents, int desiredWidth, int desiredHeight, java.lang.String barcodeType) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.12

    @Override public int Lib_PrintCutQrCodeStr(java.lang.String qrContent, java.lang.String printTxt, int distance, int desiredWidth, int desiredHeight, java.lang.String barcodeType) throws android.os.RemoteException
    {
      return 0;
    }
    //0140
    //int Lib_PrnCutPicture(in byte[] logo);
    //0141
    //int Lib_PrnCutPictureStr(in byte[] jlogo,in byte[] jString,int LinDis);
    //0142

    @Override public int Lib_PrnLogo(byte[] logo) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.13

    @Override public int Lib_SetLinPixelDis(char LinDistance) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.14

    @Override public int Lib_PrnStart() throws android.os.RemoteException
    {
      return 0;
    }
    //0145
    //int Lib_PrnConventional(int jnlevel);
    //0146
    //int Lib_PrnContinuous(int jnlevel);
    //0147
    //int Lib_PrnClose();
    //0148
    //int Lib_CTNPrnStart();
    //7.0.15

    @Override public int Lib_PrnSetLeftIndent(int x) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.16

    @Override public int Lib_PrnSetAlign(int X) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.17

    @Override public int Lib_PrnSetCharSpace(int X) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.18

    @Override public int Lib_PrnSetLineSpace(int x) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.19

    @Override public int Lib_PrnSetLeftSpace(int x) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.20

    @Override public int Lib_PrnSetGray(int nLevel) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.21

    @Override public int Lib_PrnSetSpeed(int iSpeed) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.22

    @Override public int Lib_PrnCheckStatus() throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.23

    @Override public int Lib_PrnFeedPaper(int step) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.24

    @Override public int Lib_PrnSetMode(int mode) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.25

    @Override public int Lib_PrnSetUnderline(int x) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.26

    @Override public int Lib_PrnSetReverse(int x) throws android.os.RemoteException
    {
      return 0;
    }
    //7.0.27

    @Override public int Lib_PrnSetBold(int x) throws android.os.RemoteException
    {
      return 0;
    }
    /*---------------------------  APP White List  -----------------------------------------------*///5.0.1

    @Override public boolean enableAppInstallWhiteList() throws android.os.RemoteException
    {
      return false;
    }
    //5.0.2

    @Override public boolean disableAppInstallWhiteList() throws android.os.RemoteException
    {
      return false;
    }
    //5.0.3

    @Override public boolean addAppToInstallWhiteList(java.lang.String pkgName) throws android.os.RemoteException
    {
      return false;
    }
    //5.0.4

    @Override public boolean delAppFromInstallWhiteList(java.lang.String pkgName) throws android.os.RemoteException
    {
      return false;
    }
    //5.0.5

    @Override public java.util.List<java.lang.String> getAppInstallWhiteList() throws android.os.RemoteException
    {
      return null;
    }
    //5.1.1

    @Override public boolean enableAppUninstallBlackList() throws android.os.RemoteException
    {
      return false;
    }
    //5.1.2

    @Override public boolean disableAppUninstallBlackList() throws android.os.RemoteException
    {
      return false;
    }
    //5.1.3

    @Override public boolean addAppToUninstallBlackList(java.lang.String pkgName) throws android.os.RemoteException
    {
      return false;
    }
    //5.1.4

    @Override public boolean delAppFromUninstallBlackList(java.lang.String pkgName) throws android.os.RemoteException
    {
      return false;
    }
    //5.1.5

    @Override public java.util.List<java.lang.String> getAppUninstallBlackList() throws android.os.RemoteException
    {
      return null;
    }
    /*---------------------------  Fiscal APIs -------------------------------------------------------*///6.0.1

    @Override public int fiscalOpen(int baudrate, int size, int stop, char parity, char cflow) throws android.os.RemoteException
    {
      return 0;
    }
    //6.0.2

    @Override public int fiscalClose() throws android.os.RemoteException
    {
      return 0;
    }
    //6.0.3

    @Override public int fiscalWrite(byte[] data) throws android.os.RemoteException
    {
      return 0;
    }
    //6.0.4

    @Override public int fiscalRead(byte[] buffer, int bufLen, int timeout) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.ciontek.ciontekposservice.ICiontekPosService
  {
    private static final java.lang.String DESCRIPTOR = "com.ciontek.ciontekposservice.ICiontekPosService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.ciontek.ciontekposservice.ICiontekPosService interface,
     * generating a proxy if needed.
     */
    public static com.ciontek.ciontekposservice.ICiontekPosService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.ciontek.ciontekposservice.ICiontekPosService))) {
        return ((com.ciontek.ciontekposservice.ICiontekPosService)iin);
      }
      return new com.ciontek.ciontekposservice.ICiontekPosService.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_installRomPackage:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _result = this.installRomPackage(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getOSVersion:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getOSVersion();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_getDeviceId:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getDeviceId();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_Lib_LogSwitch:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.Lib_LogSwitch(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_GetRand:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          int _arg0_length = data.readInt();
          if ((_arg0_length<0)) {
            _arg0 = null;
          }
          else {
            _arg0 = new byte[_arg0_length];
          }
          int _result = this.Lib_GetRand(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg0);
          return true;
        }
        case TRANSACTION_Lib_Update_32550:
        {
          data.enforceInterface(descriptor);
          int _result = this.Lib_Update_32550();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_GetVersion:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          int _arg0_length = data.readInt();
          if ((_arg0_length<0)) {
            _arg0 = null;
          }
          else {
            _arg0 = new byte[_arg0_length];
          }
          int _result = this.Lib_GetVersion(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg0);
          return true;
        }
        case TRANSACTION_Lib_ReadSN:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          int _arg0_length = data.readInt();
          if ((_arg0_length<0)) {
            _arg0 = null;
          }
          else {
            _arg0 = new byte[_arg0_length];
          }
          int _result = this.Lib_ReadSN(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg0);
          return true;
        }
        case TRANSACTION_Lib_WriteSN:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.Lib_WriteSN(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_ReadChipID:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          int _arg0_length = data.readInt();
          if ((_arg0_length<0)) {
            _arg0 = null;
          }
          else {
            _arg0 = new byte[_arg0_length];
          }
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.Lib_ReadChipID(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg0);
          return true;
        }
        case TRANSACTION_Lib_IccOpen:
        {
          data.enforceInterface(descriptor);
          byte _arg0;
          _arg0 = data.readByte();
          byte _arg1;
          _arg1 = data.readByte();
          byte[] _arg2;
          int _arg2_length = data.readInt();
          if ((_arg2_length<0)) {
            _arg2 = null;
          }
          else {
            _arg2 = new byte[_arg2_length];
          }
          int _result = this.Lib_IccOpen(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_Lib_IccClose:
        {
          data.enforceInterface(descriptor);
          byte _arg0;
          _arg0 = data.readByte();
          int _result = this.Lib_IccClose(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_IccCommand:
        {
          data.enforceInterface(descriptor);
          byte _arg0;
          _arg0 = data.readByte();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          int _arg2_length = data.readInt();
          if ((_arg2_length<0)) {
            _arg2 = null;
          }
          else {
            _arg2 = new byte[_arg2_length];
          }
          int _result = this.Lib_IccCommand(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_Lib_IccCheck:
        {
          data.enforceInterface(descriptor);
          byte _arg0;
          _arg0 = data.readByte();
          int _result = this.Lib_IccCheck(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_SC_ApduCmd:
        {
          data.enforceInterface(descriptor);
          byte _arg0;
          _arg0 = data.readByte();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          int _arg3_length = data.readInt();
          if ((_arg3_length<0)) {
            _arg3 = null;
          }
          else {
            _arg3 = new byte[_arg3_length];
          }
          byte[] _arg4;
          int _arg4_length = data.readInt();
          if ((_arg4_length<0)) {
            _arg4 = null;
          }
          else {
            _arg4 = new byte[_arg4_length];
          }
          int _result = this.SC_ApduCmd(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          reply.writeByteArray(_arg4);
          return true;
        }
        case TRANSACTION_Lib_PrnInit:
        {
          data.enforceInterface(descriptor);
          int _result = this.Lib_PrnInit();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnSetSpace:
        {
          data.enforceInterface(descriptor);
          byte _arg0;
          _arg0 = data.readByte();
          byte _arg1;
          _arg1 = data.readByte();
          int _result = this.Lib_PrnSetSpace(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnSetFont:
        {
          data.enforceInterface(descriptor);
          byte _arg0;
          _arg0 = data.readByte();
          byte _arg1;
          _arg1 = data.readByte();
          byte _arg2;
          _arg2 = data.readByte();
          int _result = this.Lib_PrnSetFont(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnGetFont:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _result = this.Lib_PrnGetFont(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnStep:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.Lib_PrnStep(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnSetVoltage:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.Lib_PrnSetVoltage(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnIsCharge:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.Lib_PrnIsCharge(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnStr:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _result = this.Lib_PrnStr(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnBmp:
        {
          data.enforceInterface(descriptor);
          android.graphics.Bitmap _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.Lib_PrnBmp(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnBarcode:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          java.lang.String _arg3;
          _arg3 = data.readString();
          int _result = this.Lib_PrnBarcode(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrintCutQrCode:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          java.lang.String _arg3;
          _arg3 = data.readString();
          int _result = this.Lib_PrintCutQrCode(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrintCutQrCodeStr:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          java.lang.String _arg5;
          _arg5 = data.readString();
          int _result = this.Lib_PrintCutQrCodeStr(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnLogo:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.Lib_PrnLogo(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_SetLinPixelDis:
        {
          data.enforceInterface(descriptor);
          char _arg0;
          _arg0 = (char)data.readInt();
          int _result = this.Lib_SetLinPixelDis(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnStart:
        {
          data.enforceInterface(descriptor);
          int _result = this.Lib_PrnStart();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnSetLeftIndent:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.Lib_PrnSetLeftIndent(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnSetAlign:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.Lib_PrnSetAlign(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnSetCharSpace:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.Lib_PrnSetCharSpace(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnSetLineSpace:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.Lib_PrnSetLineSpace(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnSetLeftSpace:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.Lib_PrnSetLeftSpace(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnSetGray:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.Lib_PrnSetGray(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnSetSpeed:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.Lib_PrnSetSpeed(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnCheckStatus:
        {
          data.enforceInterface(descriptor);
          int _result = this.Lib_PrnCheckStatus();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnFeedPaper:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.Lib_PrnFeedPaper(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnSetMode:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.Lib_PrnSetMode(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnSetUnderline:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.Lib_PrnSetUnderline(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnSetReverse:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.Lib_PrnSetReverse(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_Lib_PrnSetBold:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.Lib_PrnSetBold(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_enableAppInstallWhiteList:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.enableAppInstallWhiteList();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_disableAppInstallWhiteList:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.disableAppInstallWhiteList();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_addAppToInstallWhiteList:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          boolean _result = this.addAppToInstallWhiteList(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_delAppFromInstallWhiteList:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          boolean _result = this.delAppFromInstallWhiteList(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_getAppInstallWhiteList:
        {
          data.enforceInterface(descriptor);
          java.util.List<java.lang.String> _result = this.getAppInstallWhiteList();
          reply.writeNoException();
          reply.writeStringList(_result);
          return true;
        }
        case TRANSACTION_enableAppUninstallBlackList:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.enableAppUninstallBlackList();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_disableAppUninstallBlackList:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.disableAppUninstallBlackList();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_addAppToUninstallBlackList:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          boolean _result = this.addAppToUninstallBlackList(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_delAppFromUninstallBlackList:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          boolean _result = this.delAppFromUninstallBlackList(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_getAppUninstallBlackList:
        {
          data.enforceInterface(descriptor);
          java.util.List<java.lang.String> _result = this.getAppUninstallBlackList();
          reply.writeNoException();
          reply.writeStringList(_result);
          return true;
        }
        case TRANSACTION_fiscalOpen:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          char _arg3;
          _arg3 = (char)data.readInt();
          char _arg4;
          _arg4 = (char)data.readInt();
          int _result = this.fiscalOpen(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_fiscalClose:
        {
          data.enforceInterface(descriptor);
          int _result = this.fiscalClose();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_fiscalWrite:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.fiscalWrite(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_fiscalRead:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          int _arg0_length = data.readInt();
          if ((_arg0_length<0)) {
            _arg0 = null;
          }
          else {
            _arg0 = new byte[_arg0_length];
          }
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _result = this.fiscalRead(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg0);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.ciontek.ciontekposservice.ICiontekPosService
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /*--------------------------------Android OS Interface ----------------------------------------*///1.0.1

      @Override public int installRomPackage(java.lang.String romFilePath) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(romFilePath);
          boolean _status = mRemote.transact(Stub.TRANSACTION_installRomPackage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().installRomPackage(romFilePath);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //1.0.2

      @Override public java.lang.String getOSVersion() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getOSVersion, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getOSVersion();
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //1.0.3

      @Override public java.lang.String getDeviceId() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getDeviceId, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getDeviceId();
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /*--------------------------------Peripheral Interface ----------------------------------------*///2.0.1

      @Override public int Lib_LogSwitch(int LogSwitch) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(LogSwitch);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_LogSwitch, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_LogSwitch(LogSwitch);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //2.0.2

      @Override public int Lib_GetRand(byte[] rnd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((rnd==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(rnd.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_GetRand, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_GetRand(rnd);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(rnd);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //2.0.3

      @Override public int Lib_Update_32550() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_Update_32550, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_Update_32550();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //2.0.4

      @Override public int Lib_GetVersion(byte[] buf) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((buf==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(buf.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_GetVersion, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_GetVersion(buf);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(buf);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //2.0.5

      @Override public int Lib_ReadSN(byte[] SN) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((SN==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(SN.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_ReadSN, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_ReadSN(SN);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(SN);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //2.0.6

      @Override public int Lib_WriteSN(byte[] SN) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(SN);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_WriteSN, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_WriteSN(SN);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //2.0.7

      @Override public int Lib_ReadChipID(byte[] buf, int len) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((buf==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(buf.length);
          }
          _data.writeInt(len);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_ReadChipID, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_ReadChipID(buf, len);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(buf);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /*--------------------------------IC card ---------------------------------------------------*///3.0.1

      @Override public int Lib_IccOpen(byte slot, byte vccMode, byte[] atr) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(slot);
          _data.writeByte(vccMode);
          if ((atr==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(atr.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_IccOpen, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_IccOpen(slot, vccMode, atr);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(atr);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //3.0.2

      @Override public int Lib_IccClose(byte slot) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(slot);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_IccClose, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_IccClose(slot);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //3.0.3

      @Override public int Lib_IccCommand(byte slot, byte[] apduSend, byte[] apduResp) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(slot);
          _data.writeByteArray(apduSend);
          if ((apduResp==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(apduResp.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_IccCommand, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_IccCommand(slot, apduSend, apduResp);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(apduResp);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //3.0.4

      @Override public int Lib_IccCheck(byte slot) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(slot);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_IccCheck, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_IccCheck(slot);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //3.0.5

      @Override public int SC_ApduCmd(byte bslot, byte[] pbInApdu, int usInApduLen, byte[] pbOut, byte[] pbOutLen) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(bslot);
          _data.writeByteArray(pbInApdu);
          _data.writeInt(usInApduLen);
          if ((pbOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(pbOut.length);
          }
          if ((pbOutLen==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(pbOutLen.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_SC_ApduCmd, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().SC_ApduCmd(bslot, pbInApdu, usInApduLen, pbOut, pbOutLen);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(pbOut);
          _reply.readByteArray(pbOutLen);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /*--------------------------------    printer      --------------------------------------------*///7.0.1

      @Override public int Lib_PrnInit() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnInit, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnInit();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.2

      @Override public int Lib_PrnSetSpace(byte x, byte y) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(x);
          _data.writeByte(y);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnSetSpace, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnSetSpace(x, y);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.3

      @Override public int Lib_PrnSetFont(byte AsciiFontHeight, byte ExtendFontHeight, byte Zoom) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(AsciiFontHeight);
          _data.writeByte(ExtendFontHeight);
          _data.writeByte(Zoom);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnSetFont, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnSetFont(AsciiFontHeight, ExtendFontHeight, Zoom);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.4

      @Override public int Lib_PrnGetFont(byte[] AsciiFontHeight, byte[] ExtendFontHeight, byte[] Zoom) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(AsciiFontHeight);
          _data.writeByteArray(ExtendFontHeight);
          _data.writeByteArray(Zoom);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnGetFont, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnGetFont(AsciiFontHeight, ExtendFontHeight, Zoom);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.5

      @Override public int Lib_PrnStep(int pixel) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pixel);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnStep, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnStep(pixel);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.6

      @Override public int Lib_PrnSetVoltage(int voltage) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(voltage);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnSetVoltage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnSetVoltage(voltage);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.7

      @Override public int Lib_PrnIsCharge(int ischarge) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(ischarge);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnIsCharge, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnIsCharge(ischarge);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.8

      @Override public int Lib_PrnStr(java.lang.String str) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(str);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnStr, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnStr(str);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.9

      @Override public int Lib_PrnBmp(android.graphics.Bitmap bitmap) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bitmap!=null)) {
            _data.writeInt(1);
            bitmap.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnBmp, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnBmp(bitmap);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.10

      @Override public int Lib_PrnBarcode(java.lang.String contents, int desiredWidth, int desiredHeight, java.lang.String barcodeType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(contents);
          _data.writeInt(desiredWidth);
          _data.writeInt(desiredHeight);
          _data.writeString(barcodeType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnBarcode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnBarcode(contents, desiredWidth, desiredHeight, barcodeType);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.11

      @Override public int Lib_PrintCutQrCode(java.lang.String contents, int desiredWidth, int desiredHeight, java.lang.String barcodeType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(contents);
          _data.writeInt(desiredWidth);
          _data.writeInt(desiredHeight);
          _data.writeString(barcodeType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrintCutQrCode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrintCutQrCode(contents, desiredWidth, desiredHeight, barcodeType);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.12

      @Override public int Lib_PrintCutQrCodeStr(java.lang.String qrContent, java.lang.String printTxt, int distance, int desiredWidth, int desiredHeight, java.lang.String barcodeType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(qrContent);
          _data.writeString(printTxt);
          _data.writeInt(distance);
          _data.writeInt(desiredWidth);
          _data.writeInt(desiredHeight);
          _data.writeString(barcodeType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrintCutQrCodeStr, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrintCutQrCodeStr(qrContent, printTxt, distance, desiredWidth, desiredHeight, barcodeType);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //0140
      //int Lib_PrnCutPicture(in byte[] logo);
      //0141
      //int Lib_PrnCutPictureStr(in byte[] jlogo,in byte[] jString,int LinDis);
      //0142

      @Override public int Lib_PrnLogo(byte[] logo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(logo);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnLogo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnLogo(logo);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.13

      @Override public int Lib_SetLinPixelDis(char LinDistance) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((int)LinDistance));
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_SetLinPixelDis, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_SetLinPixelDis(LinDistance);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.14

      @Override public int Lib_PrnStart() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnStart, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnStart();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //0145
      //int Lib_PrnConventional(int jnlevel);
      //0146
      //int Lib_PrnContinuous(int jnlevel);
      //0147
      //int Lib_PrnClose();
      //0148
      //int Lib_CTNPrnStart();
      //7.0.15

      @Override public int Lib_PrnSetLeftIndent(int x) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(x);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnSetLeftIndent, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnSetLeftIndent(x);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.16

      @Override public int Lib_PrnSetAlign(int X) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(X);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnSetAlign, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnSetAlign(X);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.17

      @Override public int Lib_PrnSetCharSpace(int X) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(X);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnSetCharSpace, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnSetCharSpace(X);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.18

      @Override public int Lib_PrnSetLineSpace(int x) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(x);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnSetLineSpace, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnSetLineSpace(x);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.19

      @Override public int Lib_PrnSetLeftSpace(int x) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(x);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnSetLeftSpace, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnSetLeftSpace(x);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.20

      @Override public int Lib_PrnSetGray(int nLevel) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(nLevel);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnSetGray, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnSetGray(nLevel);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.21

      @Override public int Lib_PrnSetSpeed(int iSpeed) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(iSpeed);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnSetSpeed, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnSetSpeed(iSpeed);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.22

      @Override public int Lib_PrnCheckStatus() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnCheckStatus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnCheckStatus();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.23

      @Override public int Lib_PrnFeedPaper(int step) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(step);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnFeedPaper, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnFeedPaper(step);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.24

      @Override public int Lib_PrnSetMode(int mode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(mode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnSetMode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnSetMode(mode);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.25

      @Override public int Lib_PrnSetUnderline(int x) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(x);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnSetUnderline, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnSetUnderline(x);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.26

      @Override public int Lib_PrnSetReverse(int x) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(x);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnSetReverse, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnSetReverse(x);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //7.0.27

      @Override public int Lib_PrnSetBold(int x) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(x);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Lib_PrnSetBold, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Lib_PrnSetBold(x);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /*---------------------------  APP White List  -----------------------------------------------*///5.0.1

      @Override public boolean enableAppInstallWhiteList() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_enableAppInstallWhiteList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().enableAppInstallWhiteList();
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //5.0.2

      @Override public boolean disableAppInstallWhiteList() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_disableAppInstallWhiteList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().disableAppInstallWhiteList();
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //5.0.3

      @Override public boolean addAppToInstallWhiteList(java.lang.String pkgName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(pkgName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_addAppToInstallWhiteList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().addAppToInstallWhiteList(pkgName);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //5.0.4

      @Override public boolean delAppFromInstallWhiteList(java.lang.String pkgName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(pkgName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_delAppFromInstallWhiteList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().delAppFromInstallWhiteList(pkgName);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //5.0.5

      @Override public java.util.List<java.lang.String> getAppInstallWhiteList() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<java.lang.String> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAppInstallWhiteList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getAppInstallWhiteList();
          }
          _reply.readException();
          _result = _reply.createStringArrayList();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //5.1.1

      @Override public boolean enableAppUninstallBlackList() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_enableAppUninstallBlackList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().enableAppUninstallBlackList();
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //5.1.2

      @Override public boolean disableAppUninstallBlackList() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_disableAppUninstallBlackList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().disableAppUninstallBlackList();
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //5.1.3

      @Override public boolean addAppToUninstallBlackList(java.lang.String pkgName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(pkgName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_addAppToUninstallBlackList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().addAppToUninstallBlackList(pkgName);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //5.1.4

      @Override public boolean delAppFromUninstallBlackList(java.lang.String pkgName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(pkgName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_delAppFromUninstallBlackList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().delAppFromUninstallBlackList(pkgName);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //5.1.5

      @Override public java.util.List<java.lang.String> getAppUninstallBlackList() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<java.lang.String> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAppUninstallBlackList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getAppUninstallBlackList();
          }
          _reply.readException();
          _result = _reply.createStringArrayList();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /*---------------------------  Fiscal APIs -------------------------------------------------------*///6.0.1

      @Override public int fiscalOpen(int baudrate, int size, int stop, char parity, char cflow) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(baudrate);
          _data.writeInt(size);
          _data.writeInt(stop);
          _data.writeInt(((int)parity));
          _data.writeInt(((int)cflow));
          boolean _status = mRemote.transact(Stub.TRANSACTION_fiscalOpen, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().fiscalOpen(baudrate, size, stop, parity, cflow);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //6.0.2

      @Override public int fiscalClose() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_fiscalClose, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().fiscalClose();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //6.0.3

      @Override public int fiscalWrite(byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_fiscalWrite, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().fiscalWrite(data);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //6.0.4

      @Override public int fiscalRead(byte[] buffer, int bufLen, int timeout) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((buffer==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(buffer.length);
          }
          _data.writeInt(bufLen);
          _data.writeInt(timeout);
          boolean _status = mRemote.transact(Stub.TRANSACTION_fiscalRead, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().fiscalRead(buffer, bufLen, timeout);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(buffer);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static com.ciontek.ciontekposservice.ICiontekPosService sDefaultImpl;
    }
    static final int TRANSACTION_installRomPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getOSVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getDeviceId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_Lib_LogSwitch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_Lib_GetRand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_Lib_Update_32550 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_Lib_GetVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_Lib_ReadSN = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_Lib_WriteSN = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_Lib_ReadChipID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_Lib_IccOpen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_Lib_IccClose = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_Lib_IccCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_Lib_IccCheck = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_SC_ApduCmd = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_Lib_PrnInit = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_Lib_PrnSetSpace = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_Lib_PrnSetFont = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_Lib_PrnGetFont = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_Lib_PrnStep = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_Lib_PrnSetVoltage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_Lib_PrnIsCharge = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_Lib_PrnStr = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_Lib_PrnBmp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_Lib_PrnBarcode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_Lib_PrintCutQrCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_Lib_PrintCutQrCodeStr = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_Lib_PrnLogo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_Lib_SetLinPixelDis = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_Lib_PrnStart = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_Lib_PrnSetLeftIndent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_Lib_PrnSetAlign = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    static final int TRANSACTION_Lib_PrnSetCharSpace = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
    static final int TRANSACTION_Lib_PrnSetLineSpace = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
    static final int TRANSACTION_Lib_PrnSetLeftSpace = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
    static final int TRANSACTION_Lib_PrnSetGray = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
    static final int TRANSACTION_Lib_PrnSetSpeed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
    static final int TRANSACTION_Lib_PrnCheckStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
    static final int TRANSACTION_Lib_PrnFeedPaper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
    static final int TRANSACTION_Lib_PrnSetMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
    static final int TRANSACTION_Lib_PrnSetUnderline = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
    static final int TRANSACTION_Lib_PrnSetReverse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
    static final int TRANSACTION_Lib_PrnSetBold = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
    static final int TRANSACTION_enableAppInstallWhiteList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
    static final int TRANSACTION_disableAppInstallWhiteList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
    static final int TRANSACTION_addAppToInstallWhiteList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
    static final int TRANSACTION_delAppFromInstallWhiteList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
    static final int TRANSACTION_getAppInstallWhiteList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
    static final int TRANSACTION_enableAppUninstallBlackList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
    static final int TRANSACTION_disableAppUninstallBlackList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
    static final int TRANSACTION_addAppToUninstallBlackList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
    static final int TRANSACTION_delAppFromUninstallBlackList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
    static final int TRANSACTION_getAppUninstallBlackList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 52);
    static final int TRANSACTION_fiscalOpen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 53);
    static final int TRANSACTION_fiscalClose = (android.os.IBinder.FIRST_CALL_TRANSACTION + 54);
    static final int TRANSACTION_fiscalWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 55);
    static final int TRANSACTION_fiscalRead = (android.os.IBinder.FIRST_CALL_TRANSACTION + 56);
    public static boolean setDefaultImpl(com.ciontek.ciontekposservice.ICiontekPosService impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.ciontek.ciontekposservice.ICiontekPosService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /*--------------------------------Android OS Interface ----------------------------------------*///1.0.1

  public int installRomPackage(java.lang.String romFilePath) throws android.os.RemoteException;
  //1.0.2

  public java.lang.String getOSVersion() throws android.os.RemoteException;
  //1.0.3

  public java.lang.String getDeviceId() throws android.os.RemoteException;
  /*--------------------------------Peripheral Interface ----------------------------------------*///2.0.1

  public int Lib_LogSwitch(int LogSwitch) throws android.os.RemoteException;
  //2.0.2

  public int Lib_GetRand(byte[] rnd) throws android.os.RemoteException;
  //2.0.3

  public int Lib_Update_32550() throws android.os.RemoteException;
  //2.0.4

  public int Lib_GetVersion(byte[] buf) throws android.os.RemoteException;
  //2.0.5

  public int Lib_ReadSN(byte[] SN) throws android.os.RemoteException;
  //2.0.6

  public int Lib_WriteSN(byte[] SN) throws android.os.RemoteException;
  //2.0.7

  public int Lib_ReadChipID(byte[] buf, int len) throws android.os.RemoteException;
  /*--------------------------------IC card ---------------------------------------------------*///3.0.1

  public int Lib_IccOpen(byte slot, byte vccMode, byte[] atr) throws android.os.RemoteException;
  //3.0.2

  public int Lib_IccClose(byte slot) throws android.os.RemoteException;
  //3.0.3

  public int Lib_IccCommand(byte slot, byte[] apduSend, byte[] apduResp) throws android.os.RemoteException;
  //3.0.4

  public int Lib_IccCheck(byte slot) throws android.os.RemoteException;
  //3.0.5

  public int SC_ApduCmd(byte bslot, byte[] pbInApdu, int usInApduLen, byte[] pbOut, byte[] pbOutLen) throws android.os.RemoteException;
  /*--------------------------------    printer      --------------------------------------------*///7.0.1

  public int Lib_PrnInit() throws android.os.RemoteException;
  //7.0.2

  public int Lib_PrnSetSpace(byte x, byte y) throws android.os.RemoteException;
  //7.0.3

  public int Lib_PrnSetFont(byte AsciiFontHeight, byte ExtendFontHeight, byte Zoom) throws android.os.RemoteException;
  //7.0.4

  public int Lib_PrnGetFont(byte[] AsciiFontHeight, byte[] ExtendFontHeight, byte[] Zoom) throws android.os.RemoteException;
  //7.0.5

  public int Lib_PrnStep(int pixel) throws android.os.RemoteException;
  //7.0.6

  public int Lib_PrnSetVoltage(int voltage) throws android.os.RemoteException;
  //7.0.7

  public int Lib_PrnIsCharge(int ischarge) throws android.os.RemoteException;
  //7.0.8

  public int Lib_PrnStr(java.lang.String str) throws android.os.RemoteException;
  //7.0.9

  public int Lib_PrnBmp(android.graphics.Bitmap bitmap) throws android.os.RemoteException;
  //7.0.10

  public int Lib_PrnBarcode(java.lang.String contents, int desiredWidth, int desiredHeight, java.lang.String barcodeType) throws android.os.RemoteException;
  //7.0.11

  public int Lib_PrintCutQrCode(java.lang.String contents, int desiredWidth, int desiredHeight, java.lang.String barcodeType) throws android.os.RemoteException;
  //7.0.12

  public int Lib_PrintCutQrCodeStr(java.lang.String qrContent, java.lang.String printTxt, int distance, int desiredWidth, int desiredHeight, java.lang.String barcodeType) throws android.os.RemoteException;
  //0140
  //int Lib_PrnCutPicture(in byte[] logo);
  //0141
  //int Lib_PrnCutPictureStr(in byte[] jlogo,in byte[] jString,int LinDis);
  //0142

  public int Lib_PrnLogo(byte[] logo) throws android.os.RemoteException;
  //7.0.13

  public int Lib_SetLinPixelDis(char LinDistance) throws android.os.RemoteException;
  //7.0.14

  public int Lib_PrnStart() throws android.os.RemoteException;
  //0145
  //int Lib_PrnConventional(int jnlevel);
  //0146
  //int Lib_PrnContinuous(int jnlevel);
  //0147
  //int Lib_PrnClose();
  //0148
  //int Lib_CTNPrnStart();
  //7.0.15

  public int Lib_PrnSetLeftIndent(int x) throws android.os.RemoteException;
  //7.0.16

  public int Lib_PrnSetAlign(int X) throws android.os.RemoteException;
  //7.0.17

  public int Lib_PrnSetCharSpace(int X) throws android.os.RemoteException;
  //7.0.18

  public int Lib_PrnSetLineSpace(int x) throws android.os.RemoteException;
  //7.0.19

  public int Lib_PrnSetLeftSpace(int x) throws android.os.RemoteException;
  //7.0.20

  public int Lib_PrnSetGray(int nLevel) throws android.os.RemoteException;
  //7.0.21

  public int Lib_PrnSetSpeed(int iSpeed) throws android.os.RemoteException;
  //7.0.22

  public int Lib_PrnCheckStatus() throws android.os.RemoteException;
  //7.0.23

  public int Lib_PrnFeedPaper(int step) throws android.os.RemoteException;
  //7.0.24

  public int Lib_PrnSetMode(int mode) throws android.os.RemoteException;
  //7.0.25

  public int Lib_PrnSetUnderline(int x) throws android.os.RemoteException;
  //7.0.26

  public int Lib_PrnSetReverse(int x) throws android.os.RemoteException;
  //7.0.27

  public int Lib_PrnSetBold(int x) throws android.os.RemoteException;
  /*---------------------------  APP White List  -----------------------------------------------*///5.0.1

  public boolean enableAppInstallWhiteList() throws android.os.RemoteException;
  //5.0.2

  public boolean disableAppInstallWhiteList() throws android.os.RemoteException;
  //5.0.3

  public boolean addAppToInstallWhiteList(java.lang.String pkgName) throws android.os.RemoteException;
  //5.0.4

  public boolean delAppFromInstallWhiteList(java.lang.String pkgName) throws android.os.RemoteException;
  //5.0.5

  public java.util.List<java.lang.String> getAppInstallWhiteList() throws android.os.RemoteException;
  //5.1.1

  public boolean enableAppUninstallBlackList() throws android.os.RemoteException;
  //5.1.2

  public boolean disableAppUninstallBlackList() throws android.os.RemoteException;
  //5.1.3

  public boolean addAppToUninstallBlackList(java.lang.String pkgName) throws android.os.RemoteException;
  //5.1.4

  public boolean delAppFromUninstallBlackList(java.lang.String pkgName) throws android.os.RemoteException;
  //5.1.5

  public java.util.List<java.lang.String> getAppUninstallBlackList() throws android.os.RemoteException;
  /*---------------------------  Fiscal APIs -------------------------------------------------------*///6.0.1

  public int fiscalOpen(int baudrate, int size, int stop, char parity, char cflow) throws android.os.RemoteException;
  //6.0.2

  public int fiscalClose() throws android.os.RemoteException;
  //6.0.3

  public int fiscalWrite(byte[] data) throws android.os.RemoteException;
  //6.0.4

  public int fiscalRead(byte[] buffer, int bufLen, int timeout) throws android.os.RemoteException;
}
