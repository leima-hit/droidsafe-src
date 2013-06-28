package org.bouncycastle.math.ec;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.math.BigInteger;

class WTauNafMultiplier implements ECMultiplier {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:46.938 -0400", hash_original_method = "25BA0794289AAEB8CCD4FF1151858B35", hash_generated_method = "25BA0794289AAEB8CCD4FF1151858B35")
    public WTauNafMultiplier ()
    {
        //Synthesized constructor
    }


    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:46.939 -0400", hash_original_method = "02F90693504CEA800318EF0ACD8D13BB", hash_generated_method = "A45C21690E130F90841659DD33750692")
    public ECPoint multiply(ECPoint point, BigInteger k, PreCompInfo preCompInfo) {
        ECPoint varB4EAC82CA7396A68D541C85D26508E83_267022635 = null; //Variable for return #1
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Only ECPoint.F2m can be " +
                    "used in WTauNafMultiplier");
        } //End block
        ECPoint.F2m p = (ECPoint.F2m)point;
        ECCurve.F2m curve = (ECCurve.F2m) p.getCurve();
        int m = curve.getM();
        byte a = curve.getA().toBigInteger().byteValue();
        byte mu = curve.getMu();
        BigInteger[] s = curve.getSi();
        ZTauElement rho = Tnaf.partModReduction(k, m, a, s, mu, (byte)10);
        varB4EAC82CA7396A68D541C85D26508E83_267022635 = multiplyWTnaf(p, rho, preCompInfo, a, mu);
        addTaint(point.getTaint());
        addTaint(k.getTaint());
        addTaint(preCompInfo.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_267022635.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_267022635;
        // ---------- Original Method ----------
        //if (!(point instanceof ECPoint.F2m))
        //{
            //throw new IllegalArgumentException("Only ECPoint.F2m can be " +
                    //"used in WTauNafMultiplier");
        //}
        //ECPoint.F2m p = (ECPoint.F2m)point;
        //ECCurve.F2m curve = (ECCurve.F2m) p.getCurve();
        //int m = curve.getM();
        //byte a = curve.getA().toBigInteger().byteValue();
        //byte mu = curve.getMu();
        //BigInteger[] s = curve.getSi();
        //ZTauElement rho = Tnaf.partModReduction(k, m, a, s, mu, (byte)10);
        //return multiplyWTnaf(p, rho, preCompInfo, a, mu);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:46.940 -0400", hash_original_method = "35C9D9252ADD71DF3C65B7738D13F8CD", hash_generated_method = "0F80536E15B9F8E5096B9D20CA902F12")
    private ECPoint.F2m multiplyWTnaf(ECPoint.F2m p, ZTauElement lambda,
            PreCompInfo preCompInfo, byte a, byte mu) {
        ECPoint.F2m varB4EAC82CA7396A68D541C85D26508E83_1393054138 = null; //Variable for return #1
        ZTauElement[] alpha;
        {
            alpha = Tnaf.alpha0;
        } //End block
        {
            alpha = Tnaf.alpha1;
        } //End block
        BigInteger tw = Tnaf.getTw(mu, Tnaf.WIDTH);
        byte[] u = Tnaf.tauAdicWNaf(mu, lambda, Tnaf.WIDTH,
                BigInteger.valueOf(Tnaf.POW_2_WIDTH), tw, alpha);
        varB4EAC82CA7396A68D541C85D26508E83_1393054138 = multiplyFromWTnaf(p, u, preCompInfo);
        addTaint(p.getTaint());
        addTaint(lambda.getTaint());
        addTaint(preCompInfo.getTaint());
        addTaint(a);
        addTaint(mu);
        varB4EAC82CA7396A68D541C85D26508E83_1393054138.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1393054138;
        // ---------- Original Method ----------
        //ZTauElement[] alpha;
        //if (a == 0)
        //{
            //alpha = Tnaf.alpha0;
        //}
        //else
        //{
            //alpha = Tnaf.alpha1;
        //}
        //BigInteger tw = Tnaf.getTw(mu, Tnaf.WIDTH);
        //byte[]u = Tnaf.tauAdicWNaf(mu, lambda, Tnaf.WIDTH,
                //BigInteger.valueOf(Tnaf.POW_2_WIDTH), tw, alpha);
        //return multiplyFromWTnaf(p, u, preCompInfo);
    }

    
    private static ECPoint.F2m multiplyFromWTnaf(ECPoint.F2m p, byte[] u,
            PreCompInfo preCompInfo) {
        ECCurve.F2m curve = (ECCurve.F2m)p.getCurve();
        byte a = curve.getA().toBigInteger().byteValue();
        ECPoint.F2m[] pu;
        if ((preCompInfo == null) || !(preCompInfo instanceof WTauNafPreCompInfo))
        {
            pu = Tnaf.getPreComp(p, a);
            p.setPreCompInfo(new WTauNafPreCompInfo(pu));
        }
        else
        {
            pu = ((WTauNafPreCompInfo)preCompInfo).getPreComp();
        }
        ECPoint.F2m q = (ECPoint.F2m) p.getCurve().getInfinity();
        for (int i = u.length - 1; i >= 0; i--)
        {
            q = Tnaf.tau(q);
            if (u[i] != 0)
            {
                if (u[i] > 0)
                {
                    q = q.addSimple(pu[u[i]]);
                }
                else
                {
                    q = q.subtractSimple(pu[-u[i]]);
                }
            }
        }
        return q;
    }

    
}

