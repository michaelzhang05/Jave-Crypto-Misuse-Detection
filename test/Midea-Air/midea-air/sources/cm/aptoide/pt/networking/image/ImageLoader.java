package cm.aptoide.pt.networking.image;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import c.o.a.b;
import cm.aptoide.pt.R;
import cm.aptoide.pt.utils.AptoideUtils;
import com.bumptech.glide.c;
import com.bumptech.glide.load.b;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.o.c.u;
import com.bumptech.glide.p.h;
import com.bumptech.glide.p.l.f;
import com.bumptech.glide.p.l.g;
import com.bumptech.glide.p.l.i;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public class ImageLoader {
    private static final String TAG = "cm.aptoide.pt.networking.image.ImageLoader";
    private final Resources resources;
    private final WeakReference<Context> weakContext;
    private final WindowManager windowManager;

    private ImageLoader(Context context) {
        this.weakContext = new WeakReference<>(context);
        this.resources = context.getResources();
        this.windowManager = (WindowManager) context.getSystemService("window");
    }

    public static void cancel(Context context, View view) {
        c.t(context).d(view);
    }

    private int getAttrColor(int i2) {
        if (this.weakContext.get() == null) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        this.weakContext.get().getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.data;
    }

    private int getAttrDrawable(int i2) {
        if (this.weakContext.get() == null) {
            return R.drawable.placeholder_square;
        }
        TypedValue typedValue = new TypedValue();
        this.weakContext.get().getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId;
    }

    @SuppressLint({"CheckResult"})
    private h getRequestOptions() {
        b bVar;
        h hVar = new h();
        if (Build.VERSION.SDK_INT >= 26) {
            bVar = b.PREFER_ARGB_8888;
            hVar.h();
        } else {
            bVar = b.PREFER_RGB_565;
        }
        return hVar.k(bVar).i(j.f8549d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadWithPalettePlaceholder$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void a(String str, int i2, ImageView imageView, c.o.a.b bVar) {
        loadWithColorPlaceholder(str, bVar.f(i2), imageView);
    }

    public static ImageLoader with(Context context) {
        return new ImageLoader(context);
    }

    public i<Drawable> load(int i2, ImageView imageView) {
        Context context = this.weakContext.get();
        if (context != null) {
            return c.t(context).j(Integer.valueOf(i2)).b(getRequestOptions()).D0(imageView);
        }
        Log.e(TAG, "::load() Context is null");
        return null;
    }

    public Bitmap loadBitmap(String str) {
        Context context = this.weakContext.get();
        if (context != null) {
            try {
                return c.t(context).b().J0(str).M0().get();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
                return null;
            } catch (ExecutionException e3) {
                e3.printStackTrace();
                return null;
            }
        }
        Log.e(TAG, "::loadBitmap() Context is null");
        return null;
    }

    public f loadImageToNotification(f fVar, String str) {
        Context context = this.weakContext.get();
        if (context != null) {
            return (f) c.t(context.getApplicationContext()).b().J0(str).b(getRequestOptions()).A0(fVar);
        }
        Log.e(TAG, "::loadImageToNotification() Context is null");
        return fVar;
    }

    public void loadIntoTarget(String str, g<Drawable> gVar) {
        Context context = this.weakContext.get();
        if (context != null) {
            c.t(context).k(str).b(getRequestOptions()).O0(com.bumptech.glide.load.o.e.c.j()).A0(gVar);
        }
    }

    public i<Drawable> loadScreenshotToThumb(String str, String str2, int i2, ImageView imageView) {
        Context context = this.weakContext.get();
        if (context != null) {
            return c.t(context).k(AptoideUtils.IconSizeU.screenshotToThumb(str, str2, this.windowManager, this.resources)).b(getRequestOptions().b0(getAttrDrawable(i2))).O0(com.bumptech.glide.load.o.e.c.j()).D0(imageView);
        }
        Log.e(TAG, "::loadScreenshotToThumb() Context is null");
        return null;
    }

    public i<Drawable> loadUsingCircleTransform(int i2, ImageView imageView) {
        Context context = this.weakContext.get();
        if (context != null) {
            return c.t(context).j(Integer.valueOf(i2)).b(getRequestOptions().m0(new com.bumptech.glide.load.o.c.i())).O0(com.bumptech.glide.load.o.e.c.j()).D0(imageView);
        }
        Log.e(TAG, "::loadUsingCircleTransform() Context is null");
        return null;
    }

    public i<Drawable> loadUsingCircleTransformAndPlaceholder(String str, ImageView imageView, int i2) {
        Context context = this.weakContext.get();
        if (context != null) {
            return c.t(context).k(str).b(getRequestOptions().m0(new com.bumptech.glide.load.o.c.i()).b0(i2)).O0(com.bumptech.glide.load.o.e.c.j()).D0(imageView);
        }
        Log.e(TAG, "::loadUsingCircleTransformAndPlaceholder() Context is null");
        return null;
    }

    public i<Drawable> loadWithCircleTransformAndPlaceHolder(String str, ImageView imageView, int i2) {
        Context context = this.weakContext.get();
        if (context != null) {
            return c.t(context).k(str).b(getRequestOptions().m0(new com.bumptech.glide.load.o.c.i()).b0(i2)).O0(com.bumptech.glide.load.o.e.c.j()).D0(imageView);
        }
        Log.e(TAG, "::loadWithCircleTransformAndPlaceHolder() Context is null");
        return null;
    }

    public i<Drawable> loadWithCircleTransformAndPlaceHolderAvatarSize(String str, ImageView imageView, int i2) {
        return loadWithCircleTransformAndPlaceHolder(AptoideUtils.IconSizeU.generateStringAvatar(str, this.resources, this.windowManager), imageView, i2);
    }

    public i<Drawable> loadWithColorAttrPlaceholder(String str, int i2, ImageView imageView) {
        Context context = this.weakContext.get();
        if (context != null) {
            return c.t(context).k(str).b(getRequestOptions().c0(new ColorDrawable(getAttrColor(i2)))).O0(com.bumptech.glide.load.o.e.c.j()).D0(imageView);
        }
        Log.e(TAG, "::load() Context is null");
        return null;
    }

    public i<Drawable> loadWithColorPlaceholder(String str, int i2, ImageView imageView) {
        Context context = this.weakContext.get();
        if (context != null) {
            return c.t(context).k(str).b(getRequestOptions().c0(new ColorDrawable(i2))).O0(com.bumptech.glide.load.o.e.c.j()).D0(imageView);
        }
        Log.e(TAG, "::load() Context is null");
        return null;
    }

    public i<Drawable> loadWithColorPlaceholderRoundCorners(String str, int i2, ImageView imageView, int i3, com.bumptech.glide.p.g<Drawable> gVar) {
        Context context = this.weakContext.get();
        if (context != null) {
            return c.t(context).k(str).b(getRequestOptions().d().c0(new ColorDrawable(getAttrColor(i3))).q0(new com.bumptech.glide.load.o.c.g(), new u(i2))).F0(gVar).O0(com.bumptech.glide.load.o.e.c.j()).D0(imageView);
        }
        return null;
    }

    public void loadWithPalettePlaceholder(final String str, BitmapDrawable bitmapDrawable, final int i2, final ImageView imageView) {
        c.o.a.b.b(bitmapDrawable.getBitmap()).d(6).a(new b.d() { // from class: cm.aptoide.pt.networking.image.a
            @Override // c.o.a.b.d
            public final void a(c.o.a.b bVar) {
                ImageLoader.this.a(str, i2, imageView, bVar);
            }
        });
    }

    public void loadWithRoundCorners(String str, int i2, ImageView imageView, int i3) {
        Context context = this.weakContext.get();
        if (context != null) {
            c.t(context).k(str).b(getRequestOptions().d().b0(getAttrDrawable(i3)).q0(new com.bumptech.glide.load.o.c.h(), new u(i2))).O0(com.bumptech.glide.load.o.e.c.j()).D0(imageView);
        }
    }

    public i<Drawable> loadWithShadowCircleTransform(String str, ImageView imageView) {
        Context context = this.weakContext.get();
        if (context != null) {
            return c.t(context).k(str).b(getRequestOptions().m0(new ShadowCircleTransformation(context, imageView))).O0(com.bumptech.glide.load.o.e.c.j()).D0(imageView);
        }
        Log.e(TAG, "::loadWithShadowCircleTransform() Context is null");
        return null;
    }

    public i<Drawable> loadWithShadowCircleTransformWithPlaceholder(String str, ImageView imageView, int i2) {
        Context context = this.weakContext.get();
        if (context != null) {
            return c.t(context).k(str).b(getRequestOptions().m0(new ShadowCircleTransformation(context)).b0(i2)).O0(com.bumptech.glide.load.o.e.c.j()).D0(imageView);
        }
        Log.e(TAG, "::loadWithShadowCircleTransform() Context is null");
        return null;
    }

    public static <R> void cancel(Context context, com.bumptech.glide.p.c<R> cVar) {
        c.t(context).e(cVar);
    }

    public static <R> void cancel(Context context, i<R> iVar) {
        c.t(context).e(iVar);
    }

    public i<Drawable> load(String str, int i2, ImageView imageView) {
        Context context = this.weakContext.get();
        if (context != null) {
            return c.t(context).k(str).b(getRequestOptions().b0(getAttrDrawable(i2))).O0(com.bumptech.glide.load.o.e.c.j()).D0(imageView);
        }
        Log.e(TAG, "::load() Context is null");
        return null;
    }

    public i<Drawable> loadUsingCircleTransform(String str, ImageView imageView) {
        Context context = this.weakContext.get();
        if (context != null) {
            return c.t(context).k(str).b(getRequestOptions().m0(new com.bumptech.glide.load.o.c.i())).O0(com.bumptech.glide.load.o.e.c.j()).D0(imageView);
        }
        Log.e(TAG, "::loadUsingCircleTransform() Context is null");
        return null;
    }

    public i<Drawable> loadWithShadowCircleTransform(String str, ImageView imageView, int i2, float f2, float f3) {
        Context context = this.weakContext.get();
        if (context != null) {
            return c.t(context).k(str).b(getRequestOptions().m0(new ShadowCircleTransformation(context, imageView, i2, f2, f3))).O0(com.bumptech.glide.load.o.e.c.j()).D0(imageView);
        }
        Log.e(TAG, "::loadWithShadowCircleTransform() Context is null");
        return null;
    }

    public i<Drawable> loadWithRoundCorners(String str, int i2, ImageView imageView, int i3, com.bumptech.glide.p.g<Drawable> gVar) {
        Context context = this.weakContext.get();
        if (context != null) {
            return c.t(context).k(str).b(getRequestOptions().d().b0(getAttrDrawable(i3)).q0(new com.bumptech.glide.load.o.c.g(), new u(i2))).F0(gVar).O0(com.bumptech.glide.load.o.e.c.j()).D0(imageView);
        }
        return null;
    }

    public i<Drawable> loadWithShadowCircleTransformWithPlaceholder(String str, ImageView imageView, float f2, int i2) {
        Context context = this.weakContext.get();
        if (context != null) {
            return c.t(context).k(AptoideUtils.IconSizeU.generateSizeStoreString(str, this.resources, this.windowManager)).b(getRequestOptions().m0(new ShadowCircleTransformation(context, imageView, f2)).b0(getAttrDrawable(i2))).O0(com.bumptech.glide.load.o.e.c.j()).D0(imageView);
        }
        Log.e(TAG, "::loadWithShadowCircleTransform() Context is null");
        return null;
    }

    public i<Drawable> load(String str, ImageView imageView) {
        Context context = this.weakContext.get();
        if (context != null) {
            String newImageUrl = AptoideUtils.IconSizeU.getNewImageUrl(str, this.resources, this.windowManager);
            if (newImageUrl != null) {
                return c.t(context).i(Uri.parse(newImageUrl)).b(getRequestOptions()).O0(com.bumptech.glide.load.o.e.c.j()).D0(imageView);
            }
            Log.e(TAG, "newImageUrl is null");
            return null;
        }
        Log.e(TAG, "::load() Context is null");
        return null;
    }

    public i<Drawable> loadWithShadowCircleTransform(int i2, ImageView imageView) {
        Context context = this.weakContext.get();
        if (context != null) {
            return c.t(context).j(Integer.valueOf(i2)).b(getRequestOptions().m0(new ShadowCircleTransformation(context, imageView))).O0(com.bumptech.glide.load.o.e.c.j()).D0(imageView);
        }
        Log.e(TAG, "::loadWithShadowCircleTransform() Context is null");
        return null;
    }

    public i<Drawable> loadWithShadowCircleTransform(String str, ImageView imageView, int i2) {
        Context context = this.weakContext.get();
        if (context != null) {
            return c.t(context).k(AptoideUtils.IconSizeU.generateSizeStoreString(str, this.resources, this.windowManager)).b(getRequestOptions().m0(new ShadowCircleTransformation(context, (View) imageView, i2))).O0(com.bumptech.glide.load.o.e.c.j()).D0(imageView);
        }
        Log.e(TAG, "::loadWithShadowCircleTransform() Context is null");
        return null;
    }

    public Drawable load(int i2) {
        if (i2 == 0) {
            return null;
        }
        Context context = this.weakContext.get();
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                return context.getResources().getDrawable(i2, context.getTheme());
            }
            return context.getResources().getDrawable(i2);
        }
        Log.e(TAG, "::load() Context is null");
        return null;
    }

    public i<Drawable> loadWithShadowCircleTransform(int i2, ImageView imageView, int i3) {
        Context context = this.weakContext.get();
        if (context != null) {
            return c.t(context).j(Integer.valueOf(i2)).b(getRequestOptions().m0(new ShadowCircleTransformation(context, (View) imageView, i3))).O0(com.bumptech.glide.load.o.e.c.j()).D0(imageView);
        }
        Log.e(TAG, "::loadWithShadowCircleTransform() Context is null");
        return null;
    }

    public Bitmap load(String str) {
        Context context = this.weakContext.get();
        if (context != null) {
            try {
                return c.t(context).b().J0(str).M0().get();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
                return null;
            } catch (ExecutionException e3) {
                e3.printStackTrace();
                return null;
            }
        }
        Log.e(TAG, "::load() Context is null");
        return null;
    }
}
