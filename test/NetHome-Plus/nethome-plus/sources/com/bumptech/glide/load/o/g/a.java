package com.bumptech.glide.load.o.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.l.a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.r.k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* compiled from: ByteBufferGifDecoder.java */
/* loaded from: classes.dex */
public class a implements com.bumptech.glide.load.j<ByteBuffer, c> {
    private static final C0121a a = new C0121a();

    /* renamed from: b, reason: collision with root package name */
    private static final b f8818b = new b();

    /* renamed from: c, reason: collision with root package name */
    private final Context f8819c;

    /* renamed from: d, reason: collision with root package name */
    private final List<ImageHeaderParser> f8820d;

    /* renamed from: e, reason: collision with root package name */
    private final b f8821e;

    /* renamed from: f, reason: collision with root package name */
    private final C0121a f8822f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.o.g.b f8823g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ByteBufferGifDecoder.java */
    /* renamed from: com.bumptech.glide.load.o.g.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0121a {
        C0121a() {
        }

        com.bumptech.glide.l.a a(a.InterfaceC0105a interfaceC0105a, com.bumptech.glide.l.c cVar, ByteBuffer byteBuffer, int i2) {
            return new com.bumptech.glide.l.e(interfaceC0105a, cVar, byteBuffer, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ByteBufferGifDecoder.java */
    /* loaded from: classes.dex */
    public static class b {
        private final Queue<com.bumptech.glide.l.d> a = k.f(0);

        b() {
        }

        synchronized com.bumptech.glide.l.d a(ByteBuffer byteBuffer) {
            com.bumptech.glide.l.d poll;
            poll = this.a.poll();
            if (poll == null) {
                poll = new com.bumptech.glide.l.d();
            }
            return poll.p(byteBuffer);
        }

        synchronized void b(com.bumptech.glide.l.d dVar) {
            dVar.a();
            this.a.offer(dVar);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.z.e eVar, com.bumptech.glide.load.engine.z.b bVar) {
        this(context, list, eVar, bVar, f8818b, a);
    }

    private e c(ByteBuffer byteBuffer, int i2, int i3, com.bumptech.glide.l.d dVar, com.bumptech.glide.load.i iVar) {
        long b2 = com.bumptech.glide.r.f.b();
        try {
            com.bumptech.glide.l.c c2 = dVar.c();
            if (c2.b() > 0 && c2.c() == 0) {
                Bitmap.Config config = iVar.a(i.a) == com.bumptech.glide.load.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                com.bumptech.glide.l.a a2 = this.f8822f.a(this.f8823g, c2, byteBuffer, e(c2, i2, i3));
                a2.e(config);
                a2.b();
                Bitmap a3 = a2.a();
                if (a3 == null) {
                    return null;
                }
                e eVar = new e(new c(this.f8819c, a2, com.bumptech.glide.load.o.b.a(), i2, i3, a3));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + com.bumptech.glide.r.f.a(b2));
                }
                return eVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + com.bumptech.glide.r.f.a(b2));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + com.bumptech.glide.r.f.a(b2));
            }
        }
    }

    private static int e(com.bumptech.glide.l.c cVar, int i2, int i3) {
        int min = Math.min(cVar.a() / i3, cVar.d() / i2);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i2 + "x" + i3 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + "]");
        }
        return max;
    }

    @Override // com.bumptech.glide.load.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e b(ByteBuffer byteBuffer, int i2, int i3, com.bumptech.glide.load.i iVar) {
        com.bumptech.glide.l.d a2 = this.f8821e.a(byteBuffer);
        try {
            return c(byteBuffer, i2, i3, a2, iVar);
        } finally {
            this.f8821e.b(a2);
        }
    }

    @Override // com.bumptech.glide.load.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, com.bumptech.glide.load.i iVar) throws IOException {
        return !((Boolean) iVar.a(i.f8847b)).booleanValue() && com.bumptech.glide.load.e.c(this.f8820d, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    a(Context context, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.z.e eVar, com.bumptech.glide.load.engine.z.b bVar, b bVar2, C0121a c0121a) {
        this.f8819c = context.getApplicationContext();
        this.f8820d = list;
        this.f8822f = c0121a;
        this.f8823g = new com.bumptech.glide.load.o.g.b(eVar, bVar);
        this.f8821e = bVar2;
    }
}
