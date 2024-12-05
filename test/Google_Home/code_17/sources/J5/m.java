package j5;

import a5.C1639f;
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
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3655A;

/* loaded from: classes5.dex */
public final class m extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private int f34006a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f34007b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f34008c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f34009d = -1;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f34010e;

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
            i8 = this.f34006a;
        } else {
            i8 = this.f34007b;
        }
        if (z8) {
            i9 = this.f34009d;
        } else {
            i9 = this.f34008c;
        }
        imageCardView.setBackgroundColor(i8);
        imageCardView.findViewById(R.id.info_field).setBackgroundColor(i8);
        View findViewById = imageCardView.findViewById(R.id.title_text);
        AbstractC3255y.g(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setTextColor(i9);
        View findViewById2 = imageCardView.findViewById(R.id.content_text);
        AbstractC3255y.g(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setTextColor(i9);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        AbstractC3255y.i(item, "item");
        View view = viewHolder.view;
        AbstractC3255y.g(view, "null cannot be cast to non-null type androidx.leanback.widget.ImageCardView");
        ImageCardView imageCardView = (ImageCardView) view;
        if (item instanceof C1639f) {
            C1639f c1639f = (C1639f) item;
            imageCardView.setTitleText(c1639f.z());
            imageCardView.setContentText(c1639f.a0());
            C3655A c3655a = C3655A.f36474a;
            Context context = viewHolder.view.getContext();
            AbstractC3255y.h(context, "viewHolder.view.context");
            String J8 = c1639f.J();
            AbstractC3255y.f(J8);
            Drawable j8 = c3655a.j(context, J8);
            Resources resources = imageCardView.getResources();
            imageCardView.setMainImageDimensions(resources.getDimensionPixelSize(R.dimen.tv_card_height), resources.getDimensionPixelSize(R.dimen.tv_card_height));
            if (j8 != null) {
                imageCardView.setMainImage(j8);
            } else {
                imageCardView.setMainImage(this.f34010e);
            }
            imageCardView.setPadding(18, 18, 18, 18);
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3255y.i(parent, "parent");
        this.f34007b = ContextCompat.getColor(parent.getContext(), R.color.white);
        this.f34006a = ContextCompat.getColor(parent.getContext(), R.color.main_blue_pressed);
        this.f34008c = ContextCompat.getColor(parent.getContext(), R.color.black);
        this.f34009d = ContextCompat.getColor(parent.getContext(), R.color.white);
        this.f34010e = ContextCompat.getDrawable(parent.getContext(), R.drawable.vector_uptodown_logo_bag_disabled);
        a aVar = new a(parent.getContext());
        aVar.setFocusable(true);
        aVar.setFocusableInTouchMode(true);
        b(aVar, false);
        return new Presenter.ViewHolder(aVar);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        View view = viewHolder.view;
        AbstractC3255y.g(view, "null cannot be cast to non-null type androidx.leanback.widget.ImageCardView");
        ImageCardView imageCardView = (ImageCardView) view;
        imageCardView.setBadgeImage(null);
        imageCardView.setMainImage(null);
    }
}
