package g5;

import X4.C1496f;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.ImageCardView;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3307A;

/* loaded from: classes5.dex */
public final class m extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private int f31279a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f31280b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f31281c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f31282d = -1;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f31283e;

    /* loaded from: classes5.dex */
    public static final class a extends ImageCardView {
        a(Context context) {
            super(context);
        }

        @Override // androidx.leanback.widget.BaseCardView, android.view.View
        public void setSelected(boolean z8) {
            m.this.b(this, z8);
            super.setSelected(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(ImageCardView imageCardView, boolean z8) {
        int i8;
        int i9;
        if (z8) {
            i8 = this.f31279a;
        } else {
            i8 = this.f31280b;
        }
        if (z8) {
            i9 = this.f31282d;
        } else {
            i9 = this.f31281c;
        }
        imageCardView.setBackgroundColor(i8);
        imageCardView.findViewById(R.id.info_field).setBackgroundColor(i8);
        View findViewById = imageCardView.findViewById(R.id.title_text);
        AbstractC3159y.g(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setTextColor(i9);
        View findViewById2 = imageCardView.findViewById(R.id.content_text);
        AbstractC3159y.g(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setTextColor(i9);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        AbstractC3159y.i(item, "item");
        View view = viewHolder.view;
        AbstractC3159y.g(view, "null cannot be cast to non-null type androidx.leanback.widget.ImageCardView");
        ImageCardView imageCardView = (ImageCardView) view;
        if (item instanceof C1496f) {
            C1496f c1496f = (C1496f) item;
            imageCardView.setTitleText(c1496f.I());
            imageCardView.setContentText(c1496f.a0());
            C3307A c3307a = C3307A.f34473a;
            Context context = viewHolder.view.getContext();
            AbstractC3159y.h(context, "viewHolder.view.context");
            String Q8 = c1496f.Q();
            AbstractC3159y.f(Q8);
            Drawable j8 = c3307a.j(context, Q8);
            Resources resources = imageCardView.getResources();
            imageCardView.setMainImageDimensions(resources.getDimensionPixelSize(R.dimen.tv_card_height), resources.getDimensionPixelSize(R.dimen.tv_card_height));
            if (j8 != null) {
                imageCardView.setMainImage(j8);
            } else {
                imageCardView.setMainImage(this.f31283e);
            }
            imageCardView.setPadding(18, 18, 18, 18);
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3159y.i(parent, "parent");
        this.f31280b = ContextCompat.getColor(parent.getContext(), R.color.white);
        this.f31279a = ContextCompat.getColor(parent.getContext(), R.color.main_blue_pressed);
        this.f31281c = ContextCompat.getColor(parent.getContext(), R.color.black);
        this.f31282d = ContextCompat.getColor(parent.getContext(), R.color.white);
        this.f31283e = ContextCompat.getDrawable(parent.getContext(), R.drawable.vector_uptodown_logo_bag_disabled);
        a aVar = new a(parent.getContext());
        aVar.setFocusable(true);
        aVar.setFocusableInTouchMode(true);
        b(aVar, false);
        return new Presenter.ViewHolder(aVar);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        View view = viewHolder.view;
        AbstractC3159y.g(view, "null cannot be cast to non-null type androidx.leanback.widget.ImageCardView");
        ImageCardView imageCardView = (ImageCardView) view;
        imageCardView.setBadgeImage(null);
        imageCardView.setMainImage(null);
    }
}
