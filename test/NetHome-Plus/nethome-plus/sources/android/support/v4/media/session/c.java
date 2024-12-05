package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.e;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: MediaControllerCompat.java */
/* loaded from: classes.dex */
public abstract class c implements IBinder.DeathRecipient {
    final Object a;

    /* renamed from: b, reason: collision with root package name */
    a f55b;

    /* renamed from: c, reason: collision with root package name */
    android.support.v4.media.session.a f56c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaControllerCompat.java */
    /* loaded from: classes.dex */
    public class a extends Handler {
    }

    /* compiled from: MediaControllerCompat.java */
    /* loaded from: classes.dex */
    private static class b implements e.a {
        private final WeakReference<c> a;

        b(c cVar) {
            this.a = new WeakReference<>(cVar);
        }

        @Override // android.support.v4.media.session.e.a
        public void J(Bundle bundle) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.b(bundle);
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void L(List<?> list) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.e(MediaSessionCompat.QueueItem.b(list));
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void V(CharSequence charSequence) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.f(charSequence);
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void W() {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.g();
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void a(Object obj) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.c(MediaMetadataCompat.a(obj));
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void b(int i2, int i3, int i4, int i5, int i6) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(new d(i2, i3, i4, i5, i6));
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void c(Object obj) {
            c cVar = this.a.get();
            if (cVar == null || cVar.f56c != null) {
                return;
            }
            cVar.d(PlaybackStateCompat.a(obj));
        }

        @Override // android.support.v4.media.session.e.a
        public void d(String str, Bundle bundle) {
            c cVar = this.a.get();
            if (cVar != null) {
                if (cVar.f56c == null || Build.VERSION.SDK_INT >= 23) {
                    cVar.h(str, bundle);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaControllerCompat.java */
    /* renamed from: android.support.v4.media.session.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class BinderC0004c extends a.AbstractBinderC0002a {

        /* renamed from: f, reason: collision with root package name */
        private final WeakReference<c> f57f;

        /* JADX INFO: Access modifiers changed from: package-private */
        public BinderC0004c(c cVar) {
            this.f57f = new WeakReference<>(cVar);
        }

        @Override // android.support.v4.media.session.a
        public void G4(int i2) throws RemoteException {
            c cVar = this.f57f.get();
            if (cVar != null) {
                cVar.i(9, Integer.valueOf(i2), null);
            }
        }

        public void G7(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            c cVar = this.f57f.get();
            if (cVar != null) {
                cVar.i(4, parcelableVolumeInfo != null ? new d(parcelableVolumeInfo.f38f, parcelableVolumeInfo.f39g, parcelableVolumeInfo.f40h, parcelableVolumeInfo.f41i, parcelableVolumeInfo.f42j) : null, null);
            }
        }

        public void J(Bundle bundle) throws RemoteException {
            c cVar = this.f57f.get();
            if (cVar != null) {
                cVar.i(7, bundle, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void K1() throws RemoteException {
            c cVar = this.f57f.get();
            if (cVar != null) {
                cVar.i(13, null, null);
            }
        }

        public void L(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            c cVar = this.f57f.get();
            if (cVar != null) {
                cVar.i(5, list, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void R3(boolean z) throws RemoteException {
        }

        public void V(CharSequence charSequence) throws RemoteException {
            c cVar = this.f57f.get();
            if (cVar != null) {
                cVar.i(6, charSequence, null);
            }
        }

        public void W() throws RemoteException {
            c cVar = this.f57f.get();
            if (cVar != null) {
                cVar.i(8, null, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void f3(boolean z) throws RemoteException {
            c cVar = this.f57f.get();
            if (cVar != null) {
                cVar.i(11, Boolean.valueOf(z), null);
            }
        }

        public void i4(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            c cVar = this.f57f.get();
            if (cVar != null) {
                cVar.i(3, mediaMetadataCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void n5(int i2) throws RemoteException {
            c cVar = this.f57f.get();
            if (cVar != null) {
                cVar.i(12, Integer.valueOf(i2), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void u7(PlaybackStateCompat playbackStateCompat) throws RemoteException {
            c cVar = this.f57f.get();
            if (cVar != null) {
                cVar.i(2, playbackStateCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void v7(String str, Bundle bundle) throws RemoteException {
            c cVar = this.f57f.get();
            if (cVar != null) {
                cVar.i(1, str, bundle);
            }
        }
    }

    public c() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a = e.a(new b(this));
            return;
        }
        BinderC0004c binderC0004c = new BinderC0004c(this);
        this.f56c = binderC0004c;
        this.a = binderC0004c;
    }

    public void a(d dVar) {
    }

    public void b(Bundle bundle) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        i(8, null, null);
    }

    public void c(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void d(PlaybackStateCompat playbackStateCompat) {
    }

    public void e(List<MediaSessionCompat.QueueItem> list) {
    }

    public void f(CharSequence charSequence) {
    }

    public void g() {
    }

    public void h(String str, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(int i2, Object obj, Bundle bundle) {
        if (this.f55b != null) {
            throw null;
        }
    }
}
