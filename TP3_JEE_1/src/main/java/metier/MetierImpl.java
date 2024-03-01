package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements ImetierCatalogue {
@Override
public List<Livre> getLivresParMotCle(String mc) {
 List<Livre> liv= new ArrayList<Livre>();
 Connection conn=SingletonConnection.getConnection();
 try {
PreparedStatement ps= conn.prepareStatement("select * from LIVRES where NOM_LIVRES LIKE ?");
ps.setString(1, "%"+mc+"%");
ResultSet rs = ps.executeQuery();
while (rs.next()) {
Livre l = new Livre();
l.setIdLivre(rs.getLong("ID_LIVRES"));
l.setNomLivres(rs.getString("NOM_LIVRES"));
l.setPrix(rs.getDouble("PRIX"));
liv.add(l);
}
} catch (SQLException e) {
e.printStackTrace();
}
return liv;
}
@Override
public void addLivres(Livre l) {
// TODO Auto-generated method stub
}
}