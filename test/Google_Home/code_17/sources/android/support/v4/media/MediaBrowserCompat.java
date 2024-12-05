package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.b;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.app.BundleCompat;
import androidx.media.MediaBrowserProtocol;
import androidx.media.MediaBrowserServiceCompat;
import d.C2721b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* renamed from: b, reason: collision with root package name */
    static final boolean f14387b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a, reason: collision with root package name */
    private final c f14388a;

    /* loaded from: classes.dex */
    private static class CustomActionResultReceiver extends C2721b {
        @Override // d.C2721b
        protected void a(int i8, Bundle bundle) {
        }
    }

    /* loaded from: classes.dex */
    private static class ItemReceiver extends C2721b {
        @Override // d.C2721b
        protected void a(int i8, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            if (i8 == 0) {
                if (bundle != null) {
                    if (bundle.containsKey(MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
                        Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM);
                        if (parcelable != null && !(parcelable instanceof MediaItem)) {
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final int f14389a;

        /* renamed from: b, reason: collision with root package name */
        private final MediaDescriptionCompat f14390b;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public MediaItem[] newArray(int i8) {
                return new MediaItem[i8];
            }
        }

        MediaItem(Parcel parcel) {
            this.f14389a = parcel.readInt();
            this.f14390b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.f14389a + ", mDescription=" + this.f14390b + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeInt(this.f14389a);
            this.f14390b.writeToParcel(parcel, i8);
        }
    }

    /* loaded from: classes.dex */
    private static class SearchResultReceiver extends C2721b {
        @Override // d.C2721b
        protected void a(int i8, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            if (i8 == 0) {
                if (bundle != null) {
                    if (bundle.containsKey(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS)) {
                        Parcelable[] parcelableArray = bundle.getParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS);
                        if (parcelableArray != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Parcelable parcelable : parcelableArray) {
                                arrayList.add((MediaItem) parcelable);
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }

    /* loaded from: classes.dex */
    private static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f14391a;

        /* renamed from: b, reason: collision with root package name */
        private WeakReference f14392b;

        a(g gVar) {
            this.f14391a = new WeakReference(gVar);
        }

        void a(Messenger messenger) {
            this.f14392b = new WeakReference(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference weakReference = this.f14392b;
            if (weakReference != null && weakReference.get() != null && this.f14391a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.a(data);
                g gVar = (g) this.f14391a.get();
                Messenger messenger = (Messenger) this.f14392b.get();
                try {
                    int i8 = message.what;
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                            } else {
                                Bundle bundle = data.getBundle(MediaBrowserProtocol.DATA_OPTIONS);
                                MediaSessionCompat.a(bundle);
                                Bundle bundle2 = data.getBundle(MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS);
                                MediaSessionCompat.a(bundle2);
                                gVar.g(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), data.getParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST), bundle, bundle2);
                            }
                        } else {
                            gVar.i(messenger);
                        }
                    } else {
                        Bundle bundle3 = data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS);
                        MediaSessionCompat.a(bundle3);
                        gVar.f(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), (MediaSessionCompat.Token) data.getParcelable(MediaBrowserProtocol.DATA_MEDIA_SESSION_TOKEN), bundle3);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    if (message.what == 1) {
                        gVar.i(messenger);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        a mConnectionCallbackInternal;
        final Object mConnectionCallbackObj = android.support.v4.media.b.c(new C0281b());

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public interface a {
            void a();

            void c();

            void d();
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private class C0281b implements b.a {
            C0281b() {
            }

            @Override // android.support.v4.media.b.a
            public void a() {
                a aVar = b.this.mConnectionCallbackInternal;
                if (aVar != null) {
                    aVar.a();
                }
                b.this.onConnectionSuspended();
            }

            @Override // android.support.v4.media.b.a
            public void c() {
                a aVar = b.this.mConnectionCallbackInternal;
                if (aVar != null) {
                    aVar.c();
                }
                b.this.onConnected();
            }

            @Override // android.support.v4.media.b.a
            public void d() {
                a aVar = b.this.mConnectionCallbackInternal;
                if (aVar != null) {
                    aVar.d();
                }
                b.this.onConnectionFailed();
            }
        }

        public abstract void onConnected();

        public abstract void onConnectionFailed();

        public abstract void onConnectionSuspended();

        void setInternalConnectionCallback(a aVar) {
            this.mConnectionCallbackInternal = aVar;
        }
    }

    /* loaded from: classes.dex */
    interface c {
        void b();

        MediaSessionCompat.Token e();

        void h();
    }

    /* loaded from: classes.dex */
    static class d implements c, g, b.a {

        /* renamed from: a, reason: collision with root package name */
        final Context f14394a;

        /* renamed from: b, reason: collision with root package name */
        protected final Object f14395b;

        /* renamed from: c, reason: collision with root package name */
        protected final Bundle f14396c;

        /* renamed from: d, reason: collision with root package name */
        protected final a f14397d = new a(this);

        /* renamed from: e, reason: collision with root package name */
        private final ArrayMap f14398e = new ArrayMap();

        /* renamed from: f, reason: collision with root package name */
        protected int f14399f;

        /* renamed from: g, reason: collision with root package name */
        protected h f14400g;

        /* renamed from: h, reason: collision with root package name */
        protected Messenger f14401h;

        /* renamed from: i, reason: collision with root package name */
        private MediaSessionCompat.Token f14402i;

        d(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            Bundle bundle2;
            this.f14394a = context;
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            this.f14396c = bundle2;
            bundle2.putInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 1);
            bVar.setInternalConnectionCallback(this);
            this.f14395b = android.support.v4.media.b.b(context, componentName, bVar.mConnectionCallbackObj, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.a
        public void a() {
            this.f14400g = null;
            this.f14401h = null;
            this.f14402i = null;
            this.f14397d.a(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void b() {
            Messenger messenger;
            h hVar = this.f14400g;
            if (hVar != null && (messenger = this.f14401h) != null) {
                try {
                    hVar.c(messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            android.support.v4.media.b.d(this.f14395b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.a
        public void c() {
            Bundle e8 = android.support.v4.media.b.e(this.f14395b);
            if (e8 == null) {
                return;
            }
            this.f14399f = e8.getInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 0);
            IBinder binder = BundleCompat.getBinder(e8, MediaBrowserProtocol.EXTRA_MESSENGER_BINDER);
            if (binder != null) {
                this.f14400g = new h(binder, this.f14396c);
                Messenger messenger = new Messenger(this.f14397d);
                this.f14401h = messenger;
                this.f14397d.a(messenger);
                try {
                    this.f14400g.a(this.f14394a, this.f14401h);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                }
            }
            android.support.v4.media.session.b h8 = b.a.h(BundleCompat.getBinder(e8, MediaBrowserProtocol.EXTRA_SESSION_BINDER));
            if (h8 != null) {
                this.f14402i = MediaSessionCompat.Token.b(android.support.v4.media.b.f(this.f14395b), h8);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.a
        public void d() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public MediaSessionCompat.Token e() {
            if (this.f14402i == null) {
                this.f14402i = MediaSessionCompat.Token.a(android.support.v4.media.b.f(this.f14395b));
            }
            return this.f14402i;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public void f(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public void g(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f14401h != messenger) {
                return;
            }
            android.support.v4.media.a.a(this.f14398e.get(str));
            if (MediaBrowserCompat.f14387b) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void h() {
            android.support.v4.media.b.a(this.f14395b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public void i(Messenger messenger) {
        }
    }

    /* loaded from: classes.dex */
    static class e extends d {
        e(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    /* loaded from: classes.dex */
    static class f extends e {
        f(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    /* loaded from: classes.dex */
    interface g {
        void f(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void g(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

        void i(Messenger messenger);
    }

    /* loaded from: classes.dex */
    private static class h {

        /* renamed from: a, reason: collision with root package name */
        private Messenger f14403a;

        /* renamed from: b, reason: collision with root package name */
        private Bundle f14404b;

        public h(IBinder iBinder, Bundle bundle) {
            this.f14403a = new Messenger(iBinder);
            this.f14404b = bundle;
        }

        private void b(int i8, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i8;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f14403a.send(obtain);
        }

        void a(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
            bundle.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, this.f14404b);
            b(6, bundle, messenger);
        }

        void c(Messenger messenger) {
            b(7, null, messenger);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, b bVar, Bundle bundle) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26) {
            this.f14388a = new f(context, componentName, bVar, bundle);
        } else if (i8 >= 23) {
            this.f14388a = new e(context, componentName, bVar, bundle);
        } else {
            this.f14388a = new d(context, componentName, bVar, bundle);
        }
    }

    public void a() {
        this.f14388a.h();
    }

    public void b() {
        this.f14388a.b();
    }

    public MediaSessionCompat.Token c() {
        return this.f14388a.e();
    }
}
