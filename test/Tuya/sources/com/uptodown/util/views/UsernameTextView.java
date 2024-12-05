package com.uptodown.util.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.uptodown.R;
import com.uptodown.util.views.UsernameTextView;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class UsernameTextView extends AppCompatTextView {

    /* renamed from: k, reason: collision with root package name */
    public static final a f29990k = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ValueAnimator f29991a;

    /* renamed from: b, reason: collision with root package name */
    private float f29992b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f29993c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f29994d;

    /* renamed from: e, reason: collision with root package name */
    private long f29995e;

    /* renamed from: f, reason: collision with root package name */
    private long f29996f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f29997g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f29998h;

    /* renamed from: i, reason: collision with root package name */
    private String f29999i;

    /* renamed from: j, reason: collision with root package name */
    private Handler f30000j;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(UsernameTextView usernameTextView, boolean z8, String str) {
            AbstractC3159y.i(usernameTextView, "<this>");
            b(usernameTextView);
            ValueAnimator valueAnimator = usernameTextView.f29991a;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            usernameTextView.setTurbo(z8);
            usernameTextView.setUsernameFormat(str);
            if (str != null) {
                switch (str.hashCode()) {
                    case 110843959:
                        if (str.equals("type1")) {
                            usernameTextView.f29995e = 4000L;
                            usernameTextView.f29996f = 1000L;
                            break;
                        }
                        break;
                    case 110843960:
                        if (str.equals("type2")) {
                            usernameTextView.f29995e = 6000L;
                            usernameTextView.f29996f = 3000L;
                            break;
                        }
                        break;
                    case 110843961:
                        if (str.equals("type3")) {
                            usernameTextView.f29995e = 5000L;
                            usernameTextView.f29996f = AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS;
                            break;
                        }
                        break;
                }
            }
            usernameTextView.l();
        }

        public final void b(UsernameTextView usernameTextView) {
            AbstractC3159y.i(usernameTextView, "<this>");
            ValueAnimator valueAnimator = usernameTextView.f29991a;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            usernameTextView.f29991a = null;
            usernameTextView.f29992b = 0.0f;
            usernameTextView.f29993c = null;
            usernameTextView.f29994d = Integer.valueOf(ContextCompat.getColor(usernameTextView.getContext(), R.color.text_terciary));
            usernameTextView.f29995e = 0L;
            usernameTextView.f29996f = 0L;
            usernameTextView.f29997g = false;
            usernameTextView.setTurbo(false);
            usernameTextView.setUsernameFormat(null);
            usernameTextView.getPaint().setShader(null);
            Handler animationHandler = usernameTextView.getAnimationHandler();
            if (animationHandler != null) {
                animationHandler.removeCallbacksAndMessages(null);
            }
            usernameTextView.setAnimationHandler(new Handler(Looper.getMainLooper()));
            Integer num = usernameTextView.f29994d;
            AbstractC3159y.f(num);
            usernameTextView.setTextColor(num.intValue());
            usernameTextView.invalidate();
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements Runnable {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(UsernameTextView this$0, ValueAnimator it) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(it, "it");
            Object animatedValue = it.getAnimatedValue();
            AbstractC3159y.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            this$0.f29992b = ((Float) animatedValue).floatValue();
            this$0.invalidate();
        }

        @Override // java.lang.Runnable
        public void run() {
            ValueAnimator valueAnimator = UsernameTextView.this.f29991a;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            UsernameTextView usernameTextView = UsernameTextView.this;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            final UsernameTextView usernameTextView2 = UsernameTextView.this;
            ofFloat.setDuration(ofFloat.getDuration());
            ofFloat.setRepeatCount(1);
            ofFloat.setRepeatMode(2);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: n5.w
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    UsernameTextView.b.b(UsernameTextView.this, valueAnimator2);
                }
            });
            usernameTextView.f29991a = ofFloat;
            ValueAnimator valueAnimator2 = UsernameTextView.this.f29991a;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
            }
            UsernameTextView.this.f29997g = true;
            Handler animationHandler = UsernameTextView.this.getAnimationHandler();
            if (animationHandler != null) {
                animationHandler.postDelayed(this, UsernameTextView.this.f29995e);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UsernameTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        if (this.f29998h) {
            m();
            this.f30000j = new Handler(Looper.getMainLooper());
            b bVar = new b();
            String str = this.f29999i;
            if (str != null) {
                switch (str.hashCode()) {
                    case 110843959:
                        if (str.equals("type1")) {
                            int color = ContextCompat.getColor(getContext(), R.color.turbo_username_type_1_1);
                            this.f29993c = new int[]{color, ContextCompat.getColor(getContext(), R.color.turbo_username_type_1_2), color, color, color};
                            break;
                        }
                        break;
                    case 110843960:
                        if (str.equals("type2")) {
                            int color2 = ContextCompat.getColor(getContext(), R.color.turbo_username_type_2_1);
                            this.f29993c = new int[]{color2, ContextCompat.getColor(getContext(), R.color.turbo_username_type_2_2), color2, color2, color2};
                            break;
                        }
                        break;
                    case 110843961:
                        if (str.equals("type3")) {
                            int color3 = ContextCompat.getColor(getContext(), R.color.turbo_username_type_3_1);
                            this.f29993c = new int[]{color3, ContextCompat.getColor(getContext(), R.color.turbo_username_type_3_2), color3, color3, color3};
                            break;
                        }
                        break;
                }
            }
            Handler handler = this.f30000j;
            if (handler != null) {
                handler.post(bVar);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void m() {
        int color;
        getPaint().setShader(null);
        String str = this.f29999i;
        if (str != null) {
            switch (str.hashCode()) {
                case 110843959:
                    if (str.equals("type1")) {
                        color = ContextCompat.getColor(getContext(), R.color.turbo_username_type_1_1);
                        break;
                    }
                    break;
                case 110843960:
                    if (str.equals("type2")) {
                        color = ContextCompat.getColor(getContext(), R.color.turbo_username_type_2_1);
                        break;
                    }
                    break;
                case 110843961:
                    if (str.equals("type3")) {
                        color = ContextCompat.getColor(getContext(), R.color.turbo_username_type_3_1);
                        break;
                    }
                    break;
            }
            setTextColor(color);
        }
        color = ContextCompat.getColor(getContext(), R.color.text_terciary);
        setTextColor(color);
    }

    public final Handler getAnimationHandler() {
        return this.f30000j;
    }

    public final String getUsernameFormat() {
        return this.f29999i;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC3159y.i(canvas, "canvas");
        if (this.f29993c != null) {
            ValueAnimator valueAnimator = this.f29991a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                float width = getWidth();
                int[] iArr = this.f29993c;
                AbstractC3159y.f(iArr);
                float f8 = this.f29992b;
                getPaint().setShader(new LinearGradient(0.0f, 0.0f, width, 0.0f, iArr, new float[]{0.0f, f8, f8, f8, 1.0f}, Shader.TileMode.CLAMP));
            } else {
                m();
            }
        } else {
            Integer num = this.f29994d;
            if (num != null) {
                AbstractC3159y.f(num);
                setTextColor(num.intValue());
            }
        }
        super.onDraw(canvas);
    }

    public final void setAnimationHandler(Handler handler) {
        this.f30000j = handler;
    }

    public final void setTurbo(boolean z8) {
        this.f29998h = z8;
    }

    public final void setUsernameFormat(String str) {
        this.f29999i = str;
    }

    public /* synthetic */ UsernameTextView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsernameTextView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        this.f30000j = new Handler(Looper.getMainLooper());
        this.f29994d = Integer.valueOf(getCurrentTextColor());
    }
}
