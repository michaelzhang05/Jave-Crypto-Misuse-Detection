package org.apache.cordova;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import m5.h;
import m5.o;
import org.apache.cordova.f;
import t3.b0;

/* loaded from: classes.dex */
public class NativeToJsMessageQueue {

    /* renamed from: e, reason: collision with root package name */
    private static int f8341e = 16777216;

    /* renamed from: a, reason: collision with root package name */
    private boolean f8342a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedList f8343b = new LinkedList();

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f8344c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private a f8345d;

    /* loaded from: classes.dex */
    public static class EvalBridgeMode extends a {

        /* renamed from: a, reason: collision with root package name */
        private final d f8346a;

        /* renamed from: b, reason: collision with root package name */
        private final h f8347b;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ NativeToJsMessageQueue f8348a;

            a(NativeToJsMessageQueue nativeToJsMessageQueue) {
                this.f8348a = nativeToJsMessageQueue;
            }

            @Override // java.lang.Runnable
            public void run() {
                String j6 = this.f8348a.j();
                if (j6 != null) {
                    EvalBridgeMode.this.f8346a.evaluateJavascript(j6, null);
                }
            }
        }

        public EvalBridgeMode(d dVar, h hVar) {
            this.f8346a = dVar;
            this.f8347b = hVar;
        }

        @Override // org.apache.cordova.NativeToJsMessageQueue.a
        public void onNativeToJsMessageAvailable(NativeToJsMessageQueue nativeToJsMessageQueue) {
            this.f8347b.getActivity().runOnUiThread(new a(nativeToJsMessageQueue));
        }
    }

    /* loaded from: classes.dex */
    public static class LoadUrlBridgeMode extends a {

        /* renamed from: a, reason: collision with root package name */
        private final d f8350a;

        /* renamed from: b, reason: collision with root package name */
        private final h f8351b;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ NativeToJsMessageQueue f8352a;

            a(NativeToJsMessageQueue nativeToJsMessageQueue) {
                this.f8352a = nativeToJsMessageQueue;
            }

            @Override // java.lang.Runnable
            public void run() {
                String j6 = this.f8352a.j();
                if (j6 != null) {
                    LoadUrlBridgeMode.this.f8350a.loadUrl("javascript:" + j6, false);
                }
            }
        }

        public LoadUrlBridgeMode(d dVar, h hVar) {
            this.f8350a = dVar;
            this.f8351b = hVar;
        }

        @Override // org.apache.cordova.NativeToJsMessageQueue.a
        public void onNativeToJsMessageAvailable(NativeToJsMessageQueue nativeToJsMessageQueue) {
            this.f8351b.getActivity().runOnUiThread(new a(nativeToJsMessageQueue));
        }
    }

    /* loaded from: classes.dex */
    public static class NoOpBridgeMode extends a {
        @Override // org.apache.cordova.NativeToJsMessageQueue.a
        public void onNativeToJsMessageAvailable(NativeToJsMessageQueue nativeToJsMessageQueue) {
        }
    }

    /* loaded from: classes.dex */
    public static class OnlineEventsBridgeMode extends a {

        /* renamed from: a, reason: collision with root package name */
        private final c f8354a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f8355b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8356c;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                OnlineEventsBridgeMode.this.f8355b = false;
                OnlineEventsBridgeMode.this.f8356c = true;
                OnlineEventsBridgeMode.this.f8354a.b(true);
            }
        }

        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ NativeToJsMessageQueue f8358a;

            b(NativeToJsMessageQueue nativeToJsMessageQueue) {
                this.f8358a = nativeToJsMessageQueue;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f8358a.g()) {
                    return;
                }
                OnlineEventsBridgeMode.this.f8356c = false;
                OnlineEventsBridgeMode.this.f8354a.b(OnlineEventsBridgeMode.this.f8355b);
            }
        }

        /* loaded from: classes.dex */
        public interface c {
            void a(Runnable runnable);

            void b(boolean z5);
        }

        public OnlineEventsBridgeMode(c cVar) {
            this.f8354a = cVar;
        }

        @Override // org.apache.cordova.NativeToJsMessageQueue.a
        public void notifyOfFlush(NativeToJsMessageQueue nativeToJsMessageQueue, boolean z5) {
            if (!z5 || this.f8356c) {
                return;
            }
            this.f8355b = !this.f8355b;
        }

        @Override // org.apache.cordova.NativeToJsMessageQueue.a
        public void onNativeToJsMessageAvailable(NativeToJsMessageQueue nativeToJsMessageQueue) {
            this.f8354a.a(new b(nativeToJsMessageQueue));
        }

        @Override // org.apache.cordova.NativeToJsMessageQueue.a
        public void reset() {
            this.f8354a.a(new a());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
        public void notifyOfFlush(NativeToJsMessageQueue nativeToJsMessageQueue, boolean z5) {
        }

        public abstract void onNativeToJsMessageAvailable(NativeToJsMessageQueue nativeToJsMessageQueue);

        public void reset() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final String f8360a;

        /* renamed from: b, reason: collision with root package name */
        final f f8361b;

        b(String str) {
            str.getClass();
            this.f8360a = str;
            this.f8361b = null;
        }

        static int c(f fVar) {
            switch (fVar.c()) {
                case 1:
                    return fVar.g().length() + 1;
                case 2:
                default:
                    return fVar.b().length();
                case 3:
                    return fVar.b().length() + 1;
                case 4:
                case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    return 1;
                case 6:
                    return fVar.b().length() + 1;
                case 7:
                    return fVar.b().length() + 1;
                case 8:
                    int i6 = 1;
                    for (int i7 = 0; i7 < fVar.e(); i7++) {
                        int c6 = c(fVar.d(i7));
                        i6 += String.valueOf(c6).length() + 1 + c6;
                    }
                    return i6;
            }
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
        static void f(StringBuilder sb, f fVar) {
            String g6;
            char c6;
            char charAt;
            switch (fVar.c()) {
                case 1:
                    sb.append('s');
                    g6 = fVar.g();
                    sb.append(g6);
                    return;
                case 2:
                default:
                    g6 = fVar.b();
                    sb.append(g6);
                    return;
                case 3:
                    c6 = 'n';
                    sb.append(c6);
                    g6 = fVar.b();
                    sb.append(g6);
                    return;
                case 4:
                    charAt = fVar.b().charAt(0);
                    sb.append(charAt);
                    return;
                case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    charAt = 'N';
                    sb.append(charAt);
                    return;
                case 6:
                    c6 = 'A';
                    sb.append(c6);
                    g6 = fVar.b();
                    sb.append(g6);
                    return;
                case 7:
                    c6 = 'S';
                    sb.append(c6);
                    g6 = fVar.b();
                    sb.append(g6);
                    return;
                case 8:
                    sb.append('M');
                    for (int i6 = 0; i6 < fVar.e(); i6++) {
                        f d6 = fVar.d(i6);
                        sb.append(String.valueOf(c(d6)));
                        sb.append(' ');
                        f(sb, d6);
                    }
                    return;
            }
        }

        void a(StringBuilder sb) {
            String str;
            String str2;
            int c6 = this.f8361b.c();
            if (c6 != 5) {
                if (c6 == 6) {
                    str2 = "cordova.require('cordova/base64').toArrayBuffer('";
                } else if (c6 == 7) {
                    str2 = "atob('";
                } else {
                    if (c6 == 8) {
                        int e6 = this.f8361b.e();
                        for (int i6 = 0; i6 < e6; i6++) {
                            new b(this.f8361b.d(i6), this.f8360a).a(sb);
                            if (i6 < e6 - 1) {
                                sb.append(",");
                            }
                        }
                        return;
                    }
                    str = this.f8361b.b();
                }
                sb.append(str2);
                sb.append(this.f8361b.b());
                sb.append("')");
                return;
            }
            str = "null";
            sb.append(str);
        }

        int b() {
            f fVar = this.f8361b;
            return fVar == null ? this.f8360a.length() + 1 : String.valueOf(fVar.f()).length() + 2 + 1 + this.f8360a.length() + 1 + c(this.f8361b);
        }

        void d(StringBuilder sb) {
            String str;
            f fVar = this.f8361b;
            if (fVar == null) {
                str = this.f8360a;
            } else {
                int f6 = fVar.f();
                boolean z5 = f6 == f.a.OK.ordinal() || f6 == f.a.NO_RESULT.ordinal();
                sb.append("cordova.callbackFromNative('");
                sb.append(this.f8360a);
                sb.append("',");
                sb.append(z5);
                sb.append(",");
                sb.append(f6);
                sb.append(",[");
                a(sb);
                sb.append("],");
                sb.append(this.f8361b.a());
                str = ");";
            }
            sb.append(str);
        }

        void e(StringBuilder sb) {
            f fVar = this.f8361b;
            if (fVar == null) {
                sb.append('J');
                sb.append(this.f8360a);
                return;
            }
            int f6 = fVar.f();
            boolean z5 = f6 == f.a.NO_RESULT.ordinal();
            boolean z6 = f6 == f.a.OK.ordinal();
            boolean a6 = this.f8361b.a();
            sb.append((z5 || z6) ? 'S' : 'F');
            sb.append(a6 ? '1' : '0');
            sb.append(f6);
            sb.append(' ');
            sb.append(this.f8360a);
            sb.append(' ');
            f(sb, this.f8361b);
        }

        b(f fVar, String str) {
            if (str == null || fVar == null) {
                throw null;
            }
            this.f8360a = str;
            this.f8361b = fVar;
        }
    }

    private int d(b bVar) {
        int b6 = bVar.b();
        return String.valueOf(b6).length() + b6 + 1;
    }

    private void e(b bVar) {
        synchronized (this) {
            if (this.f8345d == null) {
                o.a("JsMessageQueue", "Dropping Native->JS message due to disabled bridge");
                return;
            }
            this.f8343b.add(bVar);
            if (!this.f8342a) {
                this.f8345d.onNativeToJsMessageAvailable(this);
            }
        }
    }

    private void h(b bVar, StringBuilder sb) {
        sb.append(bVar.b());
        sb.append(' ');
        bVar.e(sb);
    }

    public void a(a aVar) {
        this.f8344c.add(aVar);
    }

    public void b(String str) {
        e(new b(str));
    }

    public void c(f fVar, String str) {
        if (str == null) {
            o.d("JsMessageQueue", "Got plugin result with no callbackId", new Throwable());
            return;
        }
        boolean z5 = fVar.f() == f.a.NO_RESULT.ordinal();
        boolean a6 = fVar.a();
        if (z5 && a6) {
            return;
        }
        e(new b(fVar, str));
    }

    public boolean f() {
        return this.f8345d != null;
    }

    public boolean g() {
        return this.f8343b.isEmpty();
    }

    public String i(boolean z5) {
        int i6;
        synchronized (this) {
            a aVar = this.f8345d;
            if (aVar == null) {
                return null;
            }
            aVar.notifyOfFlush(this, z5);
            if (this.f8343b.isEmpty()) {
                return null;
            }
            Iterator it = this.f8343b.iterator();
            int i7 = 0;
            int i8 = 0;
            while (it.hasNext()) {
                int d6 = d((b) it.next());
                if (i7 > 0 && (i6 = f8341e) > 0 && i8 + d6 > i6) {
                    break;
                }
                i8 += d6;
                i7++;
            }
            StringBuilder sb = new StringBuilder(i8);
            for (int i9 = 0; i9 < i7; i9++) {
                h((b) this.f8343b.removeFirst(), sb);
            }
            if (!this.f8343b.isEmpty()) {
                sb.append('*');
            }
            return sb.toString();
        }
    }

    public String j() {
        int i6;
        synchronized (this) {
            if (this.f8343b.size() == 0) {
                return null;
            }
            Iterator it = this.f8343b.iterator();
            int i7 = 0;
            int i8 = 0;
            while (it.hasNext()) {
                int b6 = ((b) it.next()).b() + 50;
                if (i7 > 0 && (i6 = f8341e) > 0 && i8 + b6 > i6) {
                    break;
                }
                i8 += b6;
                i7++;
            }
            int i9 = i7 == this.f8343b.size() ? 1 : 0;
            StringBuilder sb = new StringBuilder(i8 + (i9 != 0 ? 0 : 100));
            for (int i10 = 0; i10 < i7; i10++) {
                b bVar = (b) this.f8343b.removeFirst();
                if (i9 == 0 || i10 + 1 != i7) {
                    sb.append("try{");
                    bVar.d(sb);
                    sb.append("}finally{");
                } else {
                    bVar.d(sb);
                }
            }
            if (i9 == 0) {
                sb.append("window.setTimeout(function(){cordova.require('cordova/plugin/android/polling').pollOnce();},0);");
            }
            while (i9 < i7) {
                sb.append('}');
                i9++;
            }
            return sb.toString();
        }
    }

    public void k() {
        synchronized (this) {
            this.f8343b.clear();
            l(-1);
        }
    }

    public void l(int i6) {
        if (i6 < -1 || i6 >= this.f8344c.size()) {
            o.a("JsMessageQueue", "Invalid NativeToJsBridgeMode: " + i6);
            return;
        }
        a aVar = i6 < 0 ? null : (a) this.f8344c.get(i6);
        if (aVar != this.f8345d) {
            StringBuilder sb = new StringBuilder();
            sb.append("Set native->JS mode to ");
            sb.append(aVar == null ? "null" : aVar.getClass().getSimpleName());
            o.a("JsMessageQueue", sb.toString());
            synchronized (this) {
                this.f8345d = aVar;
                if (aVar != null) {
                    aVar.reset();
                    if (!this.f8342a && !this.f8343b.isEmpty()) {
                        aVar.onNativeToJsMessageAvailable(this);
                    }
                }
            }
        }
    }

    public void m(boolean z5) {
        a aVar;
        if (this.f8342a && z5) {
            o.d("JsMessageQueue", "nested call to setPaused detected.", new Throwable());
        }
        this.f8342a = z5;
        if (z5) {
            return;
        }
        synchronized (this) {
            if (!this.f8343b.isEmpty() && (aVar = this.f8345d) != null) {
                aVar.onNativeToJsMessageAvailable(this);
            }
        }
    }
}
