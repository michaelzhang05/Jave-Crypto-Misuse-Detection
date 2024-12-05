package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class GlideException extends Exception {

    /* renamed from: f, reason: collision with root package name */
    private static final StackTraceElement[] f8444f = new StackTraceElement[0];

    /* renamed from: g, reason: collision with root package name */
    private final List<Throwable> f8445g;

    /* renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.load.f f8446h;

    /* renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.load.a f8447i;

    /* renamed from: j, reason: collision with root package name */
    private Class<?> f8448j;

    /* renamed from: k, reason: collision with root package name */
    private String f8449k;
    private Exception l;

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    private void a(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            Iterator<Throwable> it = ((GlideException) th).e().iterator();
            while (it.hasNext()) {
                a(it.next(), list);
            }
            return;
        }
        list.add(th);
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            appendable.append("Cause (").append(String.valueOf(i3)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i2);
            if (th instanceof GlideException) {
                ((GlideException) th).h(appendable);
            } else {
                d(th, appendable);
            }
            i2 = i3;
        }
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private void h(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List<Throwable> e() {
        return this.f8445g;
    }

    public List<Throwable> f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public void g(String str) {
        List<Throwable> f2 = f();
        int size = f2.size();
        int i2 = 0;
        while (i2 < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i3 = i2 + 1;
            sb.append(i3);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), f2.get(i2));
            i2 = i3;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f8449k);
        Class<?> cls = this.f8448j;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        sb.append(cls != null ? ", " + this.f8448j : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(this.f8447i != null ? ", " + this.f8447i : HttpUrl.FRAGMENT_ENCODE_SET);
        if (this.f8446h != null) {
            str = ", " + this.f8446h;
        }
        sb.append(str);
        List<Throwable> f2 = f();
        if (f2.isEmpty()) {
            return sb.toString();
        }
        if (f2.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(f2.size());
            sb.append(" causes:");
        }
        for (Throwable th : f2) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(com.bumptech.glide.load.f fVar, com.bumptech.glide.load.a aVar) {
        j(fVar, aVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(com.bumptech.glide.load.f fVar, com.bumptech.glide.load.a aVar, Class<?> cls) {
        this.f8446h = fVar;
        this.f8447i = aVar;
        this.f8448j = cls;
    }

    public void k(Exception exc) {
        this.l = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public GlideException(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        h(printStream);
    }

    public GlideException(String str, List<Throwable> list) {
        this.f8449k = str;
        setStackTrace(f8444f);
        this.f8445g = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        h(printWriter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements Appendable {

        /* renamed from: f, reason: collision with root package name */
        private final Appendable f8450f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f8451g = true;

        a(Appendable appendable) {
            this.f8450f = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? HttpUrl.FRAGMENT_ENCODE_SET : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c2) throws IOException {
            if (this.f8451g) {
                this.f8451g = false;
                this.f8450f.append("  ");
            }
            this.f8451g = c2 == '\n';
            this.f8450f.append(c2);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) throws IOException {
            CharSequence a = a(charSequence);
            return append(a, 0, a.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i2, int i3) throws IOException {
            CharSequence a = a(charSequence);
            boolean z = false;
            if (this.f8451g) {
                this.f8451g = false;
                this.f8450f.append("  ");
            }
            if (a.length() > 0 && a.charAt(i3 - 1) == '\n') {
                z = true;
            }
            this.f8451g = z;
            this.f8450f.append(a, i2, i3);
            return this;
        }
    }
}
