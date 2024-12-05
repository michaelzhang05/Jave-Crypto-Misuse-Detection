package com.mbridge.msdk.foundation.same.c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a */
    private final ThreadPoolExecutor f20567a;

    /* renamed from: b */
    private final Handler f20568b;

    /* renamed from: c */
    private final String f20569c;

    /* renamed from: com.mbridge.msdk.foundation.same.c.d$1 */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f20570a;

        /* renamed from: b */
        final /* synthetic */ h f20571b;

        /* renamed from: c */
        final /* synthetic */ c f20572c;

        /* renamed from: com.mbridge.msdk.foundation.same.c.d$1$1 */
        /* loaded from: classes4.dex */
        final class RunnableC03951 implements Runnable {
            RunnableC03951() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                r4.onFailedLoad("create download request error", r2);
            }
        }

        AnonymousClass1(String str, h hVar, c cVar) {
            r2 = str;
            r3 = hVar;
            r4 = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            DownloadRequest a8 = d.this.a(ab.c(r2), r2, r3, r4);
            if (a8 == null) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CommonImageLoaderRefactor", "createDownloadRequest error");
                }
                if (r4 == null) {
                    return;
                }
                d.this.f20568b.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.1.1
                    RunnableC03951() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        r4.onFailedLoad("create download request error", r2);
                    }
                });
                return;
            }
            a8.start();
        }
    }

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private static final d f20575a = new d();
    }

    /* synthetic */ d(AnonymousClass1 anonymousClass1) {
        this();
    }

    public static Bitmap d(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inDither = true;
        return BitmapFactory.decodeFile(str, options);
    }

    public final boolean b(String str) {
        File file;
        if (MBridgeConstans.DEBUG) {
            ad.a("CommonImageLoaderRefactor", "isImageFileExists imageUrl = " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            try {
                file = new File(this.f20569c + ab.c(str));
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonImageLoaderRefactor", "isImageFileExists error", e8);
                }
                file = null;
            }
            if (file == null || !file.isFile()) {
                return false;
            }
            if (!file.exists()) {
                return false;
            }
            return true;
        } catch (Exception e9) {
            if (MBridgeConstans.DEBUG) {
                ad.a("CommonImageLoaderRefactor", "isImageFileExists error", e9);
            }
            return false;
        }
    }

    private d() {
        this.f20568b = new Handler(Looper.getMainLooper());
        this.f20569c = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_IMG) + File.separator;
        this.f20567a = g.a();
    }

    /* loaded from: classes4.dex */
    public static final class b implements OnDownloadStateListener<Object> {

        /* renamed from: a */
        private final ThreadPoolExecutor f20576a;

        /* renamed from: b */
        private final Handler f20577b;

        /* renamed from: c */
        private final String f20578c;

        /* renamed from: d */
        private final String f20579d;

        /* renamed from: e */
        private final h f20580e;

        /* renamed from: f */
        private final String f20581f;

        /* renamed from: g */
        private final c f20582g;

        /* renamed from: com.mbridge.msdk.foundation.same.c.d$b$1 */
        /* loaded from: classes4.dex */
        final class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.a(b.this);
            }
        }

        /* renamed from: com.mbridge.msdk.foundation.same.c.d$b$2 */
        /* loaded from: classes4.dex */
        public final class AnonymousClass2 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f20584a;

            AnonymousClass2(String str) {
                r2 = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    b.this.f20582g.onFailedLoad(b.this.f20581f, r2);
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CommonImageLoaderRefactor", "callbackForFailed error", e8);
                    }
                }
            }
        }

        /* renamed from: com.mbridge.msdk.foundation.same.c.d$b$3 */
        /* loaded from: classes4.dex */
        public final class AnonymousClass3 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Bitmap f20586a;

            AnonymousClass3(Bitmap bitmap) {
                r2 = bitmap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    b.this.f20582g.onSuccessLoad(r2, b.this.f20581f);
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CommonImageLoaderRefactor", "callbackForSuccess error", e8);
                    }
                }
            }
        }

        public b(Handler handler, ThreadPoolExecutor threadPoolExecutor, String str, String str2, String str3, h hVar, c cVar) {
            this.f20577b = handler;
            this.f20576a = threadPoolExecutor;
            this.f20581f = str;
            this.f20578c = str2;
            this.f20579d = str3;
            this.f20580e = hVar;
            this.f20582g = cVar;
        }

        private void a(String str) {
            if (this.f20582g == null) {
                return;
            }
            this.f20577b.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.b.2

                /* renamed from: a */
                final /* synthetic */ String f20584a;

                AnonymousClass2(String str2) {
                    r2 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        b.this.f20582g.onFailedLoad(b.this.f20581f, r2);
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.a("CommonImageLoaderRefactor", "callbackForFailed error", e8);
                        }
                    }
                }
            });
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onCancelDownload(DownloadMessage<Object> downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadComplete(DownloadMessage<Object> downloadMessage) {
            File file;
            if (MBridgeConstans.DEBUG) {
                ad.a("CommonImageLoaderRefactor", "onDownloadComplete imageUrl = " + this.f20581f + " imagePath = " + this.f20578c + this.f20579d);
                try {
                    file = new File(this.f20578c + this.f20579d);
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CommonImageLoaderRefactor", "onDownloadComplete error", e8);
                    }
                    file = null;
                }
                if (file != null && file.isFile() && file.exists()) {
                    ad.a("CommonImageLoaderRefactor", "onDownloadComplete file size = " + file.length());
                } else {
                    ad.b("CommonImageLoaderRefactor", "onDownloadComplete file not exist");
                }
            }
            this.f20576a.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.b.1
                AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.a(b.this);
                }
            });
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadError(DownloadMessage<Object> downloadMessage, DownloadError downloadError) {
            if (MBridgeConstans.DEBUG) {
                ad.a("CommonImageLoaderRefactor", "onDownloadError imageUrl = " + downloadError.getException().getLocalizedMessage());
            }
            a(downloadError.getException().getLocalizedMessage());
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadStart(DownloadMessage<Object> downloadMessage) {
        }

        private Bitmap a(Bitmap bitmap, h hVar) {
            if (hVar == null) {
                return bitmap;
            }
            try {
                return hVar.a(bitmap);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonImageLoaderRefactor", "handlerImageTransformation error", e8);
                }
                return bitmap;
            }
        }

        static /* synthetic */ void a(b bVar) {
            if (bVar.f20582g == null) {
                return;
            }
            try {
                Bitmap d8 = d.d(bVar.f20578c + bVar.f20579d);
                if (d8 == null) {
                    bVar.a("bitmap decode failed");
                } else {
                    Bitmap a8 = bVar.a(d8, bVar.f20580e);
                    if (a8 == null) {
                        bVar.a("bitmap transformation failed");
                    } else if (bVar.f20582g != null) {
                        bVar.f20577b.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.b.3

                            /* renamed from: a */
                            final /* synthetic */ Bitmap f20586a;

                            AnonymousClass3(Bitmap a82) {
                                r2 = a82;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    b.this.f20582g.onSuccessLoad(r2, b.this.f20581f);
                                } catch (Exception e8) {
                                    if (MBridgeConstans.DEBUG) {
                                        ad.a("CommonImageLoaderRefactor", "callbackForSuccess error", e8);
                                    }
                                }
                            }
                        });
                    }
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonImageLoaderRefactor", "onDownloadComplete decodeBitmap error = " + e8.getLocalizedMessage());
                }
                bVar.a("bitmap decode failed");
            }
        }
    }

    public final Bitmap a(String str) {
        if (MBridgeConstans.DEBUG) {
            ad.a("CommonImageLoaderRefactor", "getImageBitmapByUrl imageUrl = " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = this.f20569c + ab.c(str);
        File file = new File(str2);
        if (file.isFile() && file.exists()) {
            try {
                return d(str2);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonImageLoaderRefactor", "getImageBitmapByUrl error", e8);
                }
            }
        }
        return null;
    }

    public final void a(String str, h hVar, c cVar) {
        try {
            this.f20567a.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.1

                /* renamed from: a */
                final /* synthetic */ String f20570a;

                /* renamed from: b */
                final /* synthetic */ h f20571b;

                /* renamed from: c */
                final /* synthetic */ c f20572c;

                /* renamed from: com.mbridge.msdk.foundation.same.c.d$1$1 */
                /* loaded from: classes4.dex */
                final class RunnableC03951 implements Runnable {
                    RunnableC03951() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        r4.onFailedLoad("create download request error", r2);
                    }
                }

                AnonymousClass1(String str2, h hVar2, c cVar2) {
                    r2 = str2;
                    r3 = hVar2;
                    r4 = cVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    DownloadRequest a8 = d.this.a(ab.c(r2), r2, r3, r4);
                    if (a8 == null) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("CommonImageLoaderRefactor", "createDownloadRequest error");
                        }
                        if (r4 == null) {
                            return;
                        }
                        d.this.f20568b.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.1.1
                            RunnableC03951() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                r4.onFailedLoad("create download request error", r2);
                            }
                        });
                        return;
                    }
                    a8.start();
                }
            });
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("CommonImageLoaderRefactor", "loadImage error", e8);
            }
        }
    }

    public DownloadRequest<?> a(String str, String str2, h hVar, c cVar) {
        try {
            return MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str2, str, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_IMAGE)).withReadTimeout(com.mbridge.msdk.foundation.same.a.f20488u).withConnectTimeout(com.mbridge.msdk.foundation.same.a.f20487t).withWriteTimeout(com.mbridge.msdk.foundation.same.a.f20486s).withDownloadPriority(DownloadPriority.LOW).withHttpRetryCounter(1).withDirectoryPathInternal(this.f20569c).withDownloadStateListener(new b(this.f20568b, this.f20567a, str2, this.f20569c, str, hVar, cVar)).withProgressStateListener(null).with("do_us_fi_re", Boolean.FALSE.toString()).build();
        } catch (Exception e8) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            ad.a("CommonImageLoaderRefactor", "createDownloadRequest error", e8);
            return null;
        }
    }
}
