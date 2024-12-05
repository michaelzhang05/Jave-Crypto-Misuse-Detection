package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes2.dex */
abstract class b extends zzj {

    /* renamed from: f, reason: collision with root package name */
    private int f10765f;

    /* JADX INFO: Access modifiers changed from: protected */
    public b(byte[] bArr) {
        Preconditions.a(bArr.length == 25);
        this.f10765f = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] i0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    abstract byte[] R();

    public boolean equals(Object obj) {
        IObjectWrapper l0;
        if (obj != null && (obj instanceof zzi)) {
            try {
                zzi zziVar = (zzi) obj;
                if (zziVar.g() == hashCode() && (l0 = zziVar.l0()) != null) {
                    return Arrays.equals(R(), (byte[]) ObjectWrapper.R(l0));
                }
                return false;
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.zzi
    public final int g() {
        return hashCode();
    }

    public int hashCode() {
        return this.f10765f;
    }

    @Override // com.google.android.gms.common.internal.zzi
    public final IObjectWrapper l0() {
        return ObjectWrapper.i0(R());
    }
}
