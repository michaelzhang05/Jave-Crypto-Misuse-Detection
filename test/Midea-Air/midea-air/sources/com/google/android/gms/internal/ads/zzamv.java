package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public interface zzamv extends IInterface {
    void E(int i2) throws RemoteException;

    void G5(zzato zzatoVar) throws RemoteException;

    void H0() throws RemoteException;

    void S() throws RemoteException;

    void U0(zzamy zzamyVar) throws RemoteException;

    void Y(zzatq zzatqVar) throws RemoteException;

    void h3(String str) throws RemoteException;

    void h7() throws RemoteException;

    void j0(zzafe zzafeVar, String str) throws RemoteException;

    void onAdClicked() throws RemoteException;

    void onAdClosed() throws RemoteException;

    void onAdFailedToLoad(int i2) throws RemoteException;

    void onAdImpression() throws RemoteException;

    void onAdLeftApplication() throws RemoteException;

    void onAdLoaded() throws RemoteException;

    void onAdOpened() throws RemoteException;

    void onAppEvent(String str, String str2) throws RemoteException;

    void onVideoPause() throws RemoteException;

    void onVideoPlay() throws RemoteException;

    void zzb(Bundle bundle) throws RemoteException;
}
