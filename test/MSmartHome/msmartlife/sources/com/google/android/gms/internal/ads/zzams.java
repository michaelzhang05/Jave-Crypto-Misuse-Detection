package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public interface zzams extends IInterface {
    zzana B7() throws RemoteException;

    zzang D1() throws RemoteException;

    void G2(zzxz zzxzVar, String str, String str2) throws RemoteException;

    void H6(zzxz zzxzVar, String str) throws RemoteException;

    void K3(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, String str2, zzamv zzamvVar, zzady zzadyVar, List<String> list) throws RemoteException;

    void M4(IObjectWrapper iObjectWrapper, zzaiq zzaiqVar, List<zzaiw> list) throws RemoteException;

    void O4(IObjectWrapper iObjectWrapper, zzatk zzatkVar, List<String> list) throws RemoteException;

    void Q2(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException;

    void W1(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException;

    void X4(IObjectWrapper iObjectWrapper) throws RemoteException;

    void Z3(IObjectWrapper iObjectWrapper) throws RemoteException;

    void destroy() throws RemoteException;

    void g4(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzatk zzatkVar, String str2) throws RemoteException;

    Bundle getInterstitialAdapterInfo() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    boolean isInitialized() throws RemoteException;

    IObjectWrapper l1() throws RemoteException;

    void m2(IObjectWrapper iObjectWrapper, zzyd zzydVar, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    boolean s3() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void showInterstitial() throws RemoteException;

    void showVideo() throws RemoteException;

    zzafe t2() throws RemoteException;

    Bundle t4() throws RemoteException;

    void u6(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, String str2, zzamv zzamvVar) throws RemoteException;

    void w4(IObjectWrapper iObjectWrapper, zzyd zzydVar, zzxz zzxzVar, String str, String str2, zzamv zzamvVar) throws RemoteException;

    zzand w6() throws RemoteException;

    Bundle zzsh() throws RemoteException;
}
