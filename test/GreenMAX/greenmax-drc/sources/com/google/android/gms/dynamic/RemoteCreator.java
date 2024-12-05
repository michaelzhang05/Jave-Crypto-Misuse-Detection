package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class RemoteCreator<T> {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private T f11023b;

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException(String str) {
            super(str);
        }

        public RemoteCreatorException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public RemoteCreator(String str) {
        this.a = str;
    }

    @KeepForSdk
    protected abstract T a(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public final T b(Context context) throws RemoteCreatorException {
        if (this.f11023b == null) {
            Preconditions.j(context);
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext != null) {
                try {
                    this.f11023b = a((IBinder) remoteContext.getClassLoader().loadClass(this.a).newInstance());
                } catch (ClassNotFoundException e2) {
                    throw new RemoteCreatorException("Could not load creator class.", e2);
                } catch (IllegalAccessException e3) {
                    throw new RemoteCreatorException("Could not access creator.", e3);
                } catch (InstantiationException e4) {
                    throw new RemoteCreatorException("Could not instantiate creator.", e4);
                }
            } else {
                throw new RemoteCreatorException("Could not get remote context.");
            }
        }
        return this.f11023b;
    }
}
