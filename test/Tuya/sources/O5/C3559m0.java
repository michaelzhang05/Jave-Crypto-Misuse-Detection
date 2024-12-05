package o5;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.UptodownApp;
import com.uptodown.views.FullHeightImageView;
import i2.InterfaceC2774b;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: o5.m0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3559m0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private W4.C f36837a;

    /* renamed from: b, reason: collision with root package name */
    private int f36838b;

    /* renamed from: o5.m0$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC2774b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X4.L f36840b;

        a(X4.L l8) {
            this.f36840b = l8;
        }

        @Override // i2.InterfaceC2774b
        public void a(Exception e8) {
            AbstractC3159y.i(e8, "e");
            e8.printStackTrace();
            C3559m0.this.f36837a.b(this.f36840b);
        }

        @Override // i2.InterfaceC2774b
        public void b() {
            if (C3559m0.this.f36838b == 0) {
                View view = C3559m0.this.itemView;
                AbstractC3159y.g(view, "null cannot be cast to non-null type com.uptodown.views.FullHeightImageView");
                if (((FullHeightImageView) view).getWidth() > 0) {
                    C3559m0 c3559m0 = C3559m0.this;
                    View view2 = c3559m0.itemView;
                    AbstractC3159y.g(view2, "null cannot be cast to non-null type com.uptodown.views.FullHeightImageView");
                    c3559m0.f36838b = ((FullHeightImageView) view2).getWidth();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3559m0(View itemView, W4.C listener) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        this.f36837a = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(C3559m0 this$0, X4.L screenShot, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(screenShot, "$screenShot");
        this$0.f36837a.a(screenShot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C3559m0 this$0, X4.T video, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(video, "$video");
        this$0.f36837a.c(video);
    }

    public final void f(final X4.L screenShot) {
        AbstractC3159y.i(screenShot, "screenShot");
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: o5.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3559m0.h(C3559m0.this, screenShot, view);
            }
        });
        View view = this.itemView;
        AbstractC3159y.g(view, "null cannot be cast to non-null type com.uptodown.views.FullHeightImageView");
        ((FullHeightImageView) view).setMinimumWidth(this.f36838b);
        com.squareup.picasso.w l8 = com.squareup.picasso.s.h().l(screenShot.f());
        UptodownApp.a aVar = UptodownApp.f28003B;
        Context context = this.itemView.getContext();
        AbstractC3159y.h(context, "itemView.context");
        com.squareup.picasso.w n8 = l8.n(aVar.g0(context));
        View view2 = this.itemView;
        AbstractC3159y.g(view2, "null cannot be cast to non-null type com.uptodown.views.FullHeightImageView");
        n8.j((FullHeightImageView) view2, new a(screenShot));
    }

    public final void g(final X4.T video) {
        AbstractC3159y.i(video, "video");
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: o5.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3559m0.i(C3559m0.this, video, view);
            }
        });
        com.squareup.picasso.w l8 = com.squareup.picasso.s.h().l(video.b());
        UptodownApp.a aVar = UptodownApp.f28003B;
        Context context = this.itemView.getContext();
        AbstractC3159y.h(context, "itemView.context");
        com.squareup.picasso.w n8 = l8.n(aVar.e0(context));
        View view = this.itemView;
        AbstractC3159y.g(view, "null cannot be cast to non-null type com.uptodown.views.FullHeightImageView");
        n8.j((FullHeightImageView) view, new b(video));
    }

    /* renamed from: o5.m0$b */
    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC2774b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X4.T f36842b;

        b(X4.T t8) {
            this.f36842b = t8;
        }

        @Override // i2.InterfaceC2774b
        public void a(Exception e8) {
            AbstractC3159y.i(e8, "e");
            e8.printStackTrace();
            C3559m0.this.f36837a.d(this.f36842b);
        }

        @Override // i2.InterfaceC2774b
        public void b() {
        }
    }
}
