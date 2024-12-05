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
    private final b f14432a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaSessionCompat.Token f14433b;

    /* renamed from: c, reason: collision with root package name */
    private final HashSet f14434c = new HashSet();

    /* loaded from: classes.dex */
    static class MediaControllerImplApi21 implements b {

        /* renamed from: a, reason: collision with root package name */
        protected final Object f14435a;

        /* renamed from: b, reason: collision with root package name */
        final Object f14436b = new Object();

        /* renamed from: c, reason: collision with root package name */
        private final List f14437c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private HashMap f14438d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        final MediaSessionCompat.Token f14439e;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a, reason: collision with root package name */
            private WeakReference f14440a;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f14440a = new WeakReference(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i8, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f14440a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f14436b) {
                        mediaControllerImplApi21.f14439e.i(b.a.h(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.f14439e.l(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
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
            public void a(Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void a0(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void c(List list) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void f(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void g() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void r0(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f14439e = token;
            Object c8 = android.support.v4.media.session.c.c(context, token.h());
            this.f14435a = c8;
            if (c8 != null) {
                if (token.g() == null) {
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
            Object d8 = android.support.v4.media.session.c.d(this.f14435a);
            if (d8 != null) {
                return MediaMetadataCompat.a(d8);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public final void b(a aVar) {
            android.support.v4.media.session.c.i(this.f14435a, aVar.mCallbackObj);
            synchronized (this.f14436b) {
                if (this.f14439e.g() != null) {
                    try {
                        a aVar2 = (a) this.f14438d.remove(aVar);
                        if (aVar2 != null) {
                            aVar.mIControllerCallback = null;
                            this.f14439e.g().J(aVar2);
                        }
                    } catch (RemoteException e8) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e8);
                    }
                } else {
                    this.f14437c.remove(aVar);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean c(KeyEvent keyEvent) {
            return android.support.v4.media.session.c.b(this.f14435a, keyEvent);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public f d() {
            Object f8 = android.support.v4.media.session.c.f(this.f14435a);
            if (f8 != null) {
                return new g(f8);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public final void e(a aVar, Handler handler) {
            android.support.v4.media.session.c.g(this.f14435a, aVar.mCallbackObj, handler);
            synchronized (this.f14436b) {
                if (this.f14439e.g() != null) {
                    a aVar2 = new a(aVar);
                    this.f14438d.put(aVar, aVar2);
                    aVar.mIControllerCallback = aVar2;
                    try {
                        this.f14439e.g().q(aVar2);
                        aVar.postToHandler(13, null, null);
                    } catch (RemoteException e8) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e8);
                    }
                } else {
                    aVar.mIControllerCallback = null;
                    this.f14437c.add(aVar);
                }
            }
        }

        void f() {
            if (this.f14439e.g() == null) {
                return;
            }
            for (a aVar : this.f14437c) {
                a aVar2 = new a(aVar);
                this.f14438d.put(aVar, aVar2);
                aVar.mIControllerCallback = aVar2;
                try {
                    this.f14439e.g().q(aVar2);
                    aVar.postToHandler(13, null, null);
                } catch (RemoteException e8) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e8);
                }
            }
            this.f14437c.clear();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PlaybackStateCompat getPlaybackState() {
            if (this.f14439e.g() != null) {
                try {
                    return this.f14439e.g().getPlaybackState();
                } catch (RemoteException e8) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e8);
                }
            }
            Object e9 = android.support.v4.media.session.c.e(this.f14435a);
            if (e9 != null) {
                return PlaybackStateCompat.a(e9);
            }
            return null;
        }

        public void h(String str, Bundle bundle, ResultReceiver resultReceiver) {
            android.support.v4.media.session.c.h(this.f14435a, str, bundle, resultReceiver);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a implements IBinder.DeathRecipient {
        final Object mCallbackObj = android.support.v4.media.session.c.a(new b(this));
        HandlerC0283a mHandler;
        android.support.v4.media.session.a mIControllerCallback;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class HandlerC0283a extends Handler {

            /* renamed from: a, reason: collision with root package name */
            boolean f14441a;

            HandlerC0283a(Looper looper) {
                super(looper);
                this.f14441a = false;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (!this.f14441a) {
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
            private final WeakReference f14443a;

            b(a aVar) {
                this.f14443a = new WeakReference(aVar);
            }

            @Override // android.support.v4.media.session.c.a
            public void a(Bundle bundle) {
                a aVar = (a) this.f14443a.get();
                if (aVar != null) {
                    aVar.onExtrasChanged(bundle);
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void b(Object obj) {
                a aVar = (a) this.f14443a.get();
                if (aVar != null) {
                    aVar.onMetadataChanged(MediaMetadataCompat.a(obj));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void c(List list) {
                a aVar = (a) this.f14443a.get();
                if (aVar != null) {
                    aVar.onQueueChanged(MediaSessionCompat.QueueItem.b(list));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void d(int i8, int i9, int i10, int i11, int i12) {
                a aVar = (a) this.f14443a.get();
                if (aVar != null) {
                    aVar.onAudioInfoChanged(new e(i8, i9, i10, i11, i12));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void e(Object obj) {
                a aVar = (a) this.f14443a.get();
                if (aVar != null && aVar.mIControllerCallback == null) {
                    aVar.onPlaybackStateChanged(PlaybackStateCompat.a(obj));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void f(CharSequence charSequence) {
                a aVar = (a) this.f14443a.get();
                if (aVar != null) {
                    aVar.onQueueTitleChanged(charSequence);
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void g() {
                a aVar = (a) this.f14443a.get();
                if (aVar != null) {
                    aVar.onSessionDestroyed();
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void h(String str, Bundle bundle) {
                a aVar = (a) this.f14443a.get();
                if (aVar != null) {
                    if (aVar.mIControllerCallback == null || Build.VERSION.SDK_INT >= 23) {
                        aVar.onSessionEvent(str, bundle);
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        private static class c extends a.AbstractBinderC0284a {

            /* renamed from: a, reason: collision with root package name */
            private final WeakReference f14444a;

            c(a aVar) {
                this.f14444a = new WeakReference(aVar);
            }

            @Override // android.support.v4.media.session.a
            public void F() {
                a aVar = (a) this.f14444a.get();
                if (aVar != null) {
                    aVar.postToHandler(13, null, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void M(boolean z8) {
                a aVar = (a) this.f14444a.get();
                if (aVar != null) {
                    aVar.postToHandler(11, Boolean.valueOf(z8), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void Z(boolean z8) {
            }

            @Override // android.support.v4.media.session.a
            public void g0(int i8) {
                a aVar = (a) this.f14444a.get();
                if (aVar != null) {
                    aVar.postToHandler(12, Integer.valueOf(i8), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void j(String str, Bundle bundle) {
                a aVar = (a) this.f14444a.get();
                if (aVar != null) {
                    aVar.postToHandler(1, str, bundle);
                }
            }

            @Override // android.support.v4.media.session.a
            public void onRepeatModeChanged(int i8) {
                a aVar = (a) this.f14444a.get();
                if (aVar != null) {
                    aVar.postToHandler(9, Integer.valueOf(i8), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void p0(PlaybackStateCompat playbackStateCompat) {
                a aVar = (a) this.f14444a.get();
                if (aVar != null) {
                    aVar.postToHandler(2, playbackStateCompat, null);
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
            HandlerC0283a handlerC0283a = this.mHandler;
            if (handlerC0283a != null) {
                Message obtainMessage = handlerC0283a.obtainMessage(i8, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        void setHandler(Handler handler) {
            if (handler == null) {
                HandlerC0283a handlerC0283a = this.mHandler;
                if (handlerC0283a != null) {
                    handlerC0283a.f14441a = false;
                    handlerC0283a.removeCallbacksAndMessages(null);
                    this.mHandler = null;
                    return;
                }
                return;
            }
            HandlerC0283a handlerC0283a2 = new HandlerC0283a(handler.getLooper());
            this.mHandler = handlerC0283a2;
            handlerC0283a2.f14441a = true;
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
            Object f8 = android.support.v4.media.session.c.f(this.f14435a);
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
            Object f8 = android.support.v4.media.session.c.f(this.f14435a);
            if (f8 != null) {
                return new i(f8);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final int f14445a;

        /* renamed from: b, reason: collision with root package name */
        private final int f14446b;

        /* renamed from: c, reason: collision with root package name */
        private final int f14447c;

        /* renamed from: d, reason: collision with root package name */
        private final int f14448d;

        /* renamed from: e, reason: collision with root package name */
        private final int f14449e;

        e(int i8, int i9, int i10, int i11, int i12) {
            this.f14445a = i8;
            this.f14446b = i9;
            this.f14447c = i10;
            this.f14448d = i11;
            this.f14449e = i12;
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
        protected final Object f14450a;

        public g(Object obj) {
            this.f14450a = obj;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void a() {
            c.d.a(this.f14450a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void b() {
            c.d.b(this.f14450a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void c() {
            c.d.c(this.f14450a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void d() {
            c.d.d(this.f14450a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void e(long j8) {
            c.d.e(this.f14450a, j8);
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
            c.d.g(this.f14450a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void i() {
            c.d.h(this.f14450a);
        }

        public void j(String str, Bundle bundle) {
            MediaControllerCompat.h(str, bundle);
            c.d.f(this.f14450a, str, bundle);
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
            this.f14433b = token;
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 24) {
                this.f14432a = new d(context, token);
                return;
            } else if (i8 >= 23) {
                this.f14432a = new c(context, token);
                return;
            } else {
                this.f14432a = new MediaControllerImplApi21(context, token);
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
            return this.f14432a.c(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public MediaMetadataCompat b() {
        return this.f14432a.a();
    }

    public PlaybackStateCompat c() {
        return this.f14432a.getPlaybackState();
    }

    public f d() {
        return this.f14432a.d();
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
            this.f14432a.e(aVar, handler);
            this.f14434c.add(aVar);
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void g(a aVar) {
        if (aVar != null) {
            try {
                this.f14434c.remove(aVar);
                this.f14432a.b(aVar);
                return;
            } finally {
                aVar.setHandler(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }
}
