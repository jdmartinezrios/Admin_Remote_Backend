package co.com.admin.remote.rest.auth;

import co.com.admin.remote.jpa.entities.Cliente;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.MACVerifier;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.ReadOnlyJWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import java.text.ParseException;
import java.util.Arrays;
import org.joda.time.DateTime;

/**
 *
 * @author Juan David Martinez
 */
public final class AuthUtils {

    private static final JWSHeader JWT_HEADER = new JWSHeader(JWSAlgorithm.HS256);
<<<<<<< HEAD
    private static final String TOKEN_SECRET = "20170706.Elegance";
=======
    private static final String TOKEN_SECRET = "adsilomejor**";
>>>>>>> 10d81fb9412cc80c521ea846b07523c9a961b98f
    public static final String AUTH_HEADER_KEY = "Authorization";

    public static String getSubject(String authHeader) throws ParseException, JOSEException {
        return decodeToken(authHeader).getSubject();
    }

    public static ReadOnlyJWTClaimsSet decodeToken(String authHeader) throws ParseException, JOSEException {
        SignedJWT signedJWT = SignedJWT.parse(getSerializedToken(authHeader));
        if (signedJWT.verify(new MACVerifier(TOKEN_SECRET))) {
            return signedJWT.getJWTClaimsSet();
        } else {
            throw new JOSEException("Signature verification failed");
        }
    }

    public static Token createToken(String host, Cliente user) throws JOSEException {
        JWTClaimsSet claim = new JWTClaimsSet();
        claim.setSubject(Integer.toString(user.getId()));
        claim.setIssuer(host);
        claim.setIssueTime(DateTime.now().toDate());
        claim.setExpirationTime(DateTime.now().plusDays(1).toDate());
<<<<<<< HEAD
        claim.setCustomClaim("user", user.getNombres());
=======
        claim.setCustomClaim("user", user.getNombres() + " " + user.getApellidos());
>>>>>>> 10d81fb9412cc80c521ea846b07523c9a961b98f
        claim.setCustomClaim("roles", Arrays.toString(user.getRolesList().toArray()));
        JWSSigner signer = new MACSigner(TOKEN_SECRET);
        SignedJWT jwt = new SignedJWT(JWT_HEADER, claim);
        jwt.sign(signer);

        return new Token(jwt.serialize());
    }

    public static String getSerializedToken(String authHeader) {
        return authHeader.split(" ")[1];
    }
}

