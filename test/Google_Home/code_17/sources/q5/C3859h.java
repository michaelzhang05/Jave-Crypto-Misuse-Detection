package q5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.uptodown.R;
import g2.EnumC2864d;
import g2.InterfaceC2865e;
import h2.AbstractC2897a;
import j2.C3187g;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: q5.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3859h extends AbstractC2897a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f38331a;

    /* renamed from: b, reason: collision with root package name */
    private C3187g f38332b;

    /* renamed from: c, reason: collision with root package name */
    private View f38333c;

    /* renamed from: d, reason: collision with root package name */
    private View f38334d;

    /* renamed from: e, reason: collision with root package name */
    private final View f38335e;

    /* renamed from: f, reason: collision with root package name */
    private final ImageView f38336f;

    public C3859h(View customPlayerUi, InterfaceC2865e youTubePlayer, Context context) {
        AbstractC3255y.i(customPlayerUi, "customPlayerUi");
        AbstractC3255y.i(youTubePlayer, "youTubePlayer");
        AbstractC3255y.i(context, "context");
        this.f38331a = context;
        this.f38334d = customPlayerUi;
        View findViewById = customPlayerUi.findViewById(R.id.v_player_panel_home);
        AbstractC3255y.h(findViewById, "playerUi.findViewById(R.id.v_player_panel_home)");
        this.f38335e = findViewById;
        View findViewById2 = this.f38334d.findViewById(R.id.iv_player_panel_feature);
        AbstractC3255y.h(findViewById2, "playerUi.findViewById(R.….iv_player_panel_feature)");
        ImageView imageView = (ImageView) findViewById2;
        this.f38336f = imageView;
        C3187g c3187g = new C3187g();
        this.f38332b = c3187g;
        this.f38333c = customPlayerUi;
        AbstractC3255y.f(c3187g);
        youTubePlayer.d(c3187g);
        m(imageView, youTubePlayer);
        m(findViewById, youTubePlayer);
    }

    private final void m(View view, final InterfaceC2865e interfaceC2865e) {
        view.setOnClickListener(new View.OnClickListener() { // from class: q5.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C3859h.n(InterfaceC2865e.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(InterfaceC2865e youTubePlayer, View view) {
        AbstractC3255y.i(youTubePlayer, "$youTubePlayer");
        youTubePlayer.play();
    }

    @Override // h2.AbstractC2897a, h2.c
    public void f(InterfaceC2865e youTubePlayer, EnumC2864d state) {
        AbstractC3255y.i(youTubePlayer, "youTubePlayer");
        AbstractC3255y.i(state, "state");
        super.f(youTubePlayer, state);
        if (state == EnumC2864d.PLAYING) {
            this.f38336f.setVisibility(8);
        } else {
            this.f38336f.setVisibility(0);
        }
    }

    public final ImageView l() {
        return this.f38336f;
    }
}
