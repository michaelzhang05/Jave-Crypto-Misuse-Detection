package android.support.v4.media.session;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.RestrictTo;
import androidx.core.app.BundleCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class MediaControllerCompat {

    /* renamed from: a, reason: collision with root package name */
    private final b f13633a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaSessionCompat.Token f13634b;

    /* renamed from: c, reason: collision with root package name */
    private final HashSet f13635c = new HashSet();

    /* loaded from: classes.dex */
    static class MediaControllerImplApi21 implements b {

        /* renamed from: a, reason: collision with root package name */
        protected final Object f13636a;

        /* renamed from: b, reason: collision with root package name */
        final Object f13637b = new Object();

        /* renamed from: c, reason: collision with root package name */
        private final List f13638c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private HashMap f13639d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        final MediaSessionCompat.Token f13640e;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a, reason: collision with root package name */
            private WeakReference f13641a;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f13641a = new WeakReference(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i8, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f13641a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f13637b) {
                        mediaControllerImplApi21.f13640e.i(b.a.i(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.f13640e.j(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                        mediaControllerImplApi21.f();
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class a extends a.c {
            a(a aVar) {
                super(aVar);
            }

            @Override // android.support.v4.media.session.a
            public void T(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void a(Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void e(List list) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void f(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void h() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void l0(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f13640e = token;
            Object c8 = android.support.v4.media.session.c.c(context, token.f());
            this.f13636a = c8;
            if (c8 != null) {
                if (token.e() == null) {
                    g();
                    return;
                }
                return;
            }
            throw new RemoteException();
        }

        private void g() {
            h("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public MediaMetadataCompat a() {
            Object d8 = android.support.v4.media.session.c.d(this.f13636a);
            if (d8 != null) {
                return MediaMetadataCompat.b(d8);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public final void b(a aVar) {
            android.support.v4.media.session.c.i(this.f13636a, aVar.mCallbackObj);
            synchronized (this.f13637b) {
                if (this.f13640e.e() != null) {
                    try {
                        a aVar2 = (a) this.f13639d.remove(aVar);
                        if (aVar2 != null) {
                            aVar.mIControllerCallback = null;
                            this.f13640e.e().F(aVar2);
                        }
                    } catch (RemoteException e8) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e8);
                    }
                } else {
                    this.f13638c.remove(aVar);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean c(KeyEvent keyEvent) {
            return android.support.v4.media.session.c.b(this.f13636a, keyEvent);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public f d() {
            Object f8 = android.support.v4.media.session.c.f(this.f13636a);
            if (f8 != null) {
                return new g(f8);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public final void e(a aVar, Handler handler) {
            android.support.v4.media.session.c.g(this.f13636a, aVar.mCallbackObj, handler);
            synchronized (this.f13637b) {
                if (this.f13640e.e() != null) {
                    a aVar2 = new a(aVar);
                    this.f13639d.put(aVar, aVar2);
                    aVar.mIControllerCallback = aVar2;
                    try {
                        this.f13640e.e().n(aVar2);
                        aVar.postToHandler(13, null, null);
                    } catch (RemoteException e8) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e8);
                    }
                } else {
                    aVar.mIControllerCallback = null;
                    this.f13638c.add(aVar);
                }
            }
        }

        void f() {
            if (this.f13640e.e() == null) {
                return;
            }
            for (a aVar : this.f13638c) {
                a aVar2 = new a(aVar);
                this.f13639d.put(aVar, aVar2);
                aVar.mIControllerCallback = aVar2;
                try {
                    this.f13640e.e().n(aVar2);
                    aVar.postToHandler(13, null, null);
                } catch (RemoteException e8) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e8);
                }
            }
            this.f13638c.clear();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PlaybackStateCompat getPlaybackState() {
            if (this.f13640e.e() != null) {
                try {
                    return this.f13640e.e().getPlaybackState();
                } catch (RemoteException e8) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e8);
                }
            }
            Object e9 = android.support.v4.media.session.c.e(this.f13636a);
            if (e9 != null) {
                return PlaybackStateCompat.b(e9);
            }
            return null;
        }

        public void h(String str, Bundle bundle, ResultReceiver resultReceiver) {
            android.support.v4.media.session.c.h(this.f13636a, str, bundle, resultReceiver);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a implements IBinder.DeathRecipient {
        final Object mCallbackObj = android.support.v4.media.session.c.a(new b(this));
        HandlerC0278a mHandler;
        android.support.v4.media.session.a mIControllerCallback;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class HandlerC0278a extends Handler {

            /* renamed from: a, reason: collision with root package name */
            boolean f13642a;

            HandlerC0278a(Looper looper) {
                super(looper);
                this.f13642a = false;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (!this.f13642a) {
                    return;
                }
                switch (message.what) {
                    case 1:
                        Bundle data = message.getData();
                        MediaSessionCompat.a(data);
                        a.this.onSessionEvent((String) message.obj, data);
                        return;
                    case 2:
                        a.this.onPlaybackStateChanged((PlaybackStateCompat) message.obj);
                        return;
                    case 3:
                        a.this.onMetadataChanged((MediaMetadataCompat) message.obj);
                        return;
                    case 4:
                        a.this.onAudioInfoChanged((e) message.obj);
                        return;
                    case 5:
                        a.this.onQueueChanged((List) message.obj);
                        return;
                    case 6:
                        a.this.onQueueTitleChanged((CharSequence) message.obj);
                        return;
                    case 7:
                        Bundle bundle = (Bundle) message.obj;
                        MediaSessionCompat.a(bundle);
                        a.this.onExtrasChanged(bundle);
                        return;
                    case 8:
                        a.this.onSessionDestroyed();
                        return;
                    case 9:
                        a.this.onRepeatModeChanged(((Integer) message.obj).intValue());
                        return;
                    case 10:
                    default:
                        return;
                    case 11:
                        a.this.onCaptioningEnabledChanged(((Boolean) message.obj).booleanValue());
                        return;
                    case 12:
                        a.this.onShuffleModeChanged(((Integer) message.obj).intValue());
                        return;
                    case 13:
                        a.this.onSessionReady();
                        return;
                }
            }
        }

        /* loaded from: classes.dex */
        private static class b implements c.a {

            /* renamed from: a, reason: collision with root package name */
            private final WeakReference f13644a;

            b(a aVar) {
                this.f13644a = new WeakReference(aVar);
            }

            @Override // android.support.v4.media.session.c.a
            public void a(Bundle bundle) {
                a aVar = (a) this.f13644a.get();
                if (aVar != null) {
                    aVar.onExtrasChanged(bundle);
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void b(Object obj) {
                a aVar = (a) this.f13644a.get();
                if (aVar != null) {
                    aVar.onMetadataChanged(MediaMetadataCompat.b(obj));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void c(int i8, int i9, int i10, int i11, int i12) {
                a aVar = (a) this.f13644a.get();
                if (aVar != null) {
                    aVar.onAudioInfoChanged(new e(i8, i9, i10, i11, i12));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void d(Object obj) {
                a aVar = (a) this.f13644a.get();
                if (aVar != null && aVar.mIControllerCallback == null) {
                    aVar.onPlaybackStateChanged(PlaybackStateCompat.b(obj));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void e(List list) {
                a aVar = (a) this.f13644a.get();
                if (aVar != null) {
                    aVar.onQueueChanged(MediaSessionCompat.QueueItem.c(list));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void f(CharSequence charSequence) {
                a aVar = (a) this.f13644a.get();
                if (aVar != null) {
                    aVar.onQueueTitleChanged(charSequence);
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void g(String str, Bundle bundle) {
                a aVar = (a) this.f13644a.get();
                if (aVar != null) {
                    if (aVar.mIControllerCallback == null || Build.VERSION.SDK_INT >= 23) {
                        aVar.onSessionEvent(str, bundle);
                    }
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void h() {
                a aVar = (a) this.f13644a.get();
                if (aVar != null) {
                    aVar.onSessionDestroyed();
                }
            }
        }

        /* loaded from: classes.dex */
        private static class c extends a.AbstractBinderC0279a {

            /* renamed from: a, reason: collision with root package name */
            private final WeakReference f13645a;

            c(a aVar) {
                this.f13645a = new WeakReference(aVar);
            }

            @Override // android.support.v4.media.session.a
            public void B() {
                a aVar = (a) this.f13645a.get();
                if (aVar != null) {
                    aVar.postToHandler(13, null, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void I(boolean z8) {
                a aVar = (a) this.f13645a.get();
                if (aVar != null) {
                    aVar.postToHandler(11, Boolean.valueOf(z8), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void R(boolean z8) {
            }

            @Override // android.support.v4.media.session.a
            public void Y(int i8) {
                a aVar = (a) this.f13645a.get();
                if (aVar != null) {
                    aVar.postToHandler(12, Integer.valueOf(i8), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void i0(PlaybackStateCompat playbackStateCompat) {
                a aVar = (a) this.f13645a.get();
                if (aVar != null) {
                    aVar.postToHandler(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void k(String str, Bundle bundle) {
                a aVar = (a) this.f13645a.get();
                if (aVar != null) {
                    aVar.postToHandler(1, str, bundle);
                }
            }

            @Override // android.support.v4.media.session.a
            public void onRepeatModeChanged(int i8) {
                a aVar = (a) this.f13645a.get();
                if (aVar != null) {
                    aVar.postToHandler(9, Integer.valueOf(i8), null);
                }
            }
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            postToHandler(8, null, null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public android.support.v4.media.session.a getIControllerCallback() {
            return this.mIControllerCallback;
        }

        public void onAudioInfoChanged(e eVar) {
        }

        public void onCaptioningEnabledChanged(boolean z8) {
        }

        public void onExtrasChanged(Bundle bundle) {
        }

        public abstract void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat);

        public abstract void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat);

        public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) {
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
        }

        public void onRepeatModeChanged(int i8) {
        }

        public void onSessionDestroyed() {
        }

        public void onSessionEvent(String str, Bundle bundle) {
        }

        public void onSessionReady() {
        }

        public void onShuffleModeChanged(int i8) {
        }

        void postToHandler(int i8, Object obj, Bundle bundle) {
            HandlerC0278a handlerC0278a = this.mHandler;
            if (handlerC0278a != null) {
                Message obtainMessage = handlerC0278a.obtainMessage(i8, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        void setHandler(Handler handler) {
            if (handler == null) {
                HandlerC0278a handlerC0278a = this.mHandler;
                if (handlerC0278a != null) {
                    handlerC0278a.f13642a = false;
                    handlerC0278a.removeCallbacksAndMessages(null);
                    this.mHandler = null;
                    return;
                }
                return;
            }
            HandlerC0278a handlerC0278a2 = new HandlerC0278a(handler.getLooper());
            this.mHandler = handlerC0278a2;
            handlerC0278a2.f13642a = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        MediaMetadataCompat a();

        void b(a aVar);

        boolean c(KeyEvent keyEvent);

        f d();

        void e(a aVar, Handler handler);

        PlaybackStateCompat getPlaybackState();
    }

    /* loaded from: classes.dex */
    static class c extends MediaControllerImplApi21 {
        public c(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21, android.support.v4.media.session.MediaControllerCompat.b
        public f d() {
            Object f8 = android.support.v4.media.session.c.f(this.f13636a);
            if (f8 != null) {
                return new h(f8);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    static class d extends c {
        public d(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c, android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21, android.support.v4.media.session.MediaControllerCompat.b
        public f d() {
            Object f8 = android.support.v4.media.session.c.f(this.f13636a);
            if (f8 != null) {
                return new i(f8);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final int f13646a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13647b;

        /* renamed from: c, reason: collision with root package name */
        private final int f13648c;

        /* renamed from: d, reason: collision with root package name */
        private final int f13649d;

        /* renamed from: e, reason: collision with root package name */
        private final int f13650e;

        e(int i8, int i9, int i10, int i11, int i12) {
            this.f13646a = i8;
            this.f13647b = i9;
            this.f13648c = i10;
            this.f13649d = i11;
            this.f13650e = i12;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        f() {
        }

        public abstract void a();

        public abstract void b();

        public abstract void c();

        public abstract void d();

        public abstract void e(long j8);

        public abstract void f(int i8);

        public abstract void g(int i8);

        public abstract void h();

        public abstract void i();
    }

    /* loaded from: classes.dex */
    static class g extends f {

        /* renamed from: a, reason: collision with root package name */
        protected final Object f13651a;

        public g(Object obj) {
            this.f13651a = obj;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void a() {
            c.d.a(this.f13651a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void b() {
            c.d.b(this.f13651a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void c() {
            c.d.c(this.f13651a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void d() {
            c.d.d(this.f13651a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void e(long j8) {
            c.d.e(this.f13651a, j8);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void f(int i8) {
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", i8);
            j("android.support.v4.media.session.action.SET_REPEAT_MODE", bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void g(int i8) {
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", i8);
            j("android.support.v4.media.session.action.SET_SHUFFLE_MODE", bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void h() {
            c.d.g(this.f13651a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void i() {
            c.d.h(this.f13651a);
        }

        public void j(String str, Bundle bundle) {
            MediaControllerCompat.h(str, bundle);
            c.d.f(this.f13651a, str, bundle);
        }
    }

    /* loaded from: classes.dex */
    static class h extends g {
        public h(Object obj) {
            super(obj);
        }
    }

    /* loaded from: classes.dex */
    static class i extends h {
        public i(Object obj) {
            super(obj);
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.f13634b = token;
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 24) {
                this.f13633a = new d(context, token);
                return;
            } else if (i8 >= 23) {
                this.f13633a = new c(context, token);
                return;
            } else {
                this.f13633a = new MediaControllerImplApi21(context, token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    static void h(String str, Bundle bundle) {
        if (str == null) {
            return;
        }
        if (str.equals("android.support.v4.media.session.action.FOLLOW") || str.equals("android.support.v4.media.session.action.UNFOLLOW")) {
            if (bundle != null && bundle.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE")) {
                return;
            }
            throw new IllegalArgumentException("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action " + str + ".");
        }
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f13633a.c(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public MediaMetadataCompat b() {
        return this.f13633a.a();
    }

    public PlaybackStateCompat c() {
        return this.f13633a.getPlaybackState();
    }

    public f d() {
        return this.f13633a.d();
    }

    public void e(a aVar) {
        f(aVar, null);
    }

    public void f(a aVar, Handler handler) {
        if (aVar != null) {
            if (handler == null) {
                handler = new Handler();
            }
            aVar.setHandler(handler);
            this.f13633a.e(aVar, handler);
            this.f13635c.add(aVar);
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void g(a aVar) {
        if (aVar != null) {
            try {
                this.f13635c.remove(aVar);
                this.f13633a.b(aVar);
                return;
            } finally {
                aVar.setHandler(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }
}
