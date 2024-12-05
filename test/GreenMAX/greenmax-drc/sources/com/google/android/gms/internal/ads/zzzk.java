package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public interface zzzk extends IInterface {
    void A4(zzzy zzzyVar) throws RemoteException;

    void C4(zzyw zzywVar) throws RemoteException;

    zzyz K5() throws RemoteException;

    String M() throws RemoteException;

    void P(zzatb zzatbVar) throws RemoteException;

    zzzs P4() throws RemoteException;

    boolean Q4(zzxz zzxzVar) throws RemoteException;

    zzyd Q5() throws RemoteException;

    void S6() throws RemoteException;

    boolean U() throws RemoteException;

    void c0(zzzp zzzpVar) throws RemoteException;

    void destroy() throws RemoteException;

    void f7(zzado zzadoVar) throws RemoteException;

    void g6(zzzs zzzsVar) throws RemoteException;

    Bundle getAdMetadata() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    void i1(boolean z) throws RemoteException;

    void k4() throws RemoteException;

    void m4(String str) throws RemoteException;

    void n6(zzaqn zzaqnVar) throws RemoteException;

    boolean p() throws RemoteException;

    void p0(zzyz zzyzVar) throws RemoteException;

    void pause() throws RemoteException;

    void q2(zzyd zzydVar) throws RemoteException;

    void q6(zzaax zzaaxVar) throws RemoteException;

    void resume() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void setUserId(String str) throws RemoteException;

    void showInterstitial() throws RemoteException;

    IObjectWrapper w0() throws RemoteException;

    String x6() throws RemoteException;

    void x7(zzacd zzacdVar) throws RemoteException;

    void z3(zzaqt zzaqtVar, String str) throws RemoteException;
}
