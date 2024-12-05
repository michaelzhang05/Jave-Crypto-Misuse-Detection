package m0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* loaded from: classes.dex */
abstract class r {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f7534a;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f7535b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f7536c;

    static {
        int i6 = Build.VERSION.SDK_INT;
        f7534a = true;
        f7535b = true;
        f7536c = i6 >= 28;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static View a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        a0.i(view, matrix);
        a0.j(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap b6 = b(view, matrix, rectF, viewGroup);
        if (b6 != null) {
            imageView.setImageBitmap(b6);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap b(android.view.View r8, android.graphics.Matrix r9, android.graphics.RectF r10, android.view.ViewGroup r11) {
        /*
            boolean r0 = m0.r.f7534a
            r1 = 0
            if (r0 == 0) goto L13
            boolean r0 = r8.isAttachedToWindow()
            r0 = r0 ^ 1
            if (r11 != 0) goto Le
            goto L14
        Le:
            boolean r2 = r11.isAttachedToWindow()
            goto L15
        L13:
            r0 = 0
        L14:
            r2 = 0
        L15:
            boolean r3 = m0.r.f7535b
            r4 = 0
            if (r3 == 0) goto L31
            if (r0 == 0) goto L31
            if (r2 != 0) goto L1f
            return r4
        L1f:
            android.view.ViewParent r1 = r8.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.indexOfChild(r8)
            android.view.ViewGroupOverlay r5 = r11.getOverlay()
            r5.add(r8)
            goto L33
        L31:
            r1 = r4
            r2 = 0
        L33:
            float r5 = r10.width()
            int r5 = java.lang.Math.round(r5)
            float r6 = r10.height()
            int r6 = java.lang.Math.round(r6)
            if (r5 <= 0) goto L99
            if (r6 <= 0) goto L99
            int r4 = r5 * r6
            float r4 = (float) r4
            r7 = 1233125376(0x49800000, float:1048576.0)
            float r7 = r7 / r4
            r4 = 1065353216(0x3f800000, float:1.0)
            float r4 = java.lang.Math.min(r4, r7)
            float r5 = (float) r5
            float r5 = r5 * r4
            int r5 = java.lang.Math.round(r5)
            float r6 = (float) r6
            float r6 = r6 * r4
            int r6 = java.lang.Math.round(r6)
            float r7 = r10.left
            float r7 = -r7
            float r10 = r10.top
            float r10 = -r10
            r9.postTranslate(r7, r10)
            r9.postScale(r4, r4)
            boolean r10 = m0.r.f7536c
            if (r10 == 0) goto L88
            android.graphics.Picture r10 = new android.graphics.Picture
            r10.<init>()
            android.graphics.Canvas r4 = r10.beginRecording(r5, r6)
            r4.concat(r9)
            r8.draw(r4)
            r10.endRecording()
            android.graphics.Bitmap r4 = m0.q.a(r10)
            goto L99
        L88:
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r5, r6, r10)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r4)
            r10.concat(r9)
            r8.draw(r10)
        L99:
            if (r3 == 0) goto La7
            if (r0 == 0) goto La7
            android.view.ViewGroupOverlay r9 = r11.getOverlay()
            r9.remove(r8)
            r1.addView(r8, r2)
        La7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.b(android.view.View, android.graphics.Matrix, android.graphics.RectF, android.view.ViewGroup):android.graphics.Bitmap");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Animator c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
