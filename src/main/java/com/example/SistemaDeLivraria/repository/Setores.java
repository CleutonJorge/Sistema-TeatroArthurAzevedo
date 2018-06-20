package com.example.SistemaDeLivraria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.SistemaDeLivraria.model.Setor;

public interface Setores extends JpaRepository<Setor, Integer>{
	
//	@Query("select p from Setor p left join p.livro u  where p.id = u.id ")
	//@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p ) ")
	
	@Query("select p from Setor p left join p.livro c left join c.categorias a where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.identificacao like 'A%' and p.setor = 1")
	public List<Setor> findAllss(@Param("ideventos") int idevento);
	
	
	@Query("select p from Setor p left join p.livro c left join c.categorias a where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.identificacao like 'A%' and p.setor = 1")
	public List<Setor> findAlls(@Param("ideventos") int idevento);
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.identificacao like 'B%' ")
	public List<Setor> findAllb(@Param("ideventos") int idevento);
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.identificacao like 'C%' ")
	public List<Setor> findAllc(@Param("ideventos") int idevento);
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.identificacao like 'D%' ")
	public List<Setor> findAlld(@Param("ideventos") int idevento);
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.identificacao like 'E%' ")
	public List<Setor> findAlle(@Param("ideventos") int idevento);
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.identificacao like 'F%' ")
	public List<Setor> findAllf(@Param("ideventos") int idevento);
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.identificacao like 'G%' ")
	public List<Setor> findAllg(@Param("ideventos") int idevento);
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.identificacao like 'H%' ")
	public List<Setor> findAllh(@Param("ideventos") int idevento);
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.identificacao like 'I%' ")
	public List<Setor> findAlli(@Param("ideventos") int idevento);
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.identificacao like 'J%' ")
	public List<Setor> findAllj(@Param("ideventos") int idevento);
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.identificacao like 'K%' ")
	public List<Setor> findAllk(@Param("ideventos") int idevento);
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.identificacao like 'L%' ")
	public List<Setor> findAlll(@Param("ideventos") int idevento);
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.identificacao like 'M%' ")
	public List<Setor> findAllm(@Param("ideventos") int idevento);
	
	
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 2 and p.identificacao like '01%' or p.identificacao like '02%' and p.setor = 2")
	public List<Setor> findFrisa0102(@Param("ideventos") int idevento);

	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 2 and p.identificacao like '03%' or p.identificacao like '05%' and p.setor = 2")
	public List<Setor> findFrisa0305(@Param("ideventos") int idevento);
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 2 and p.identificacao like '06%' or p.identificacao like '08%' and p.setor = 2")
	public List<Setor> findFrisa0608(@Param("ideventos") int idevento);
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 2 and p.identificacao like '09%' or p.identificacao like '10%' and p.setor = 2")
	public List<Setor> findFrisa0910(@Param("ideventos") int idevento);
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 2 and p.identificacao like '11%' or p.identificacao like '12%' and p.setor = 2")
	public List<Setor> findFrisa1112(@Param("ideventos") int idevento);
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 2 and p.identificacao like '13%' or p.identificacao like '14%' and p.setor = 2")
	public List<Setor> findFrisa1314(@Param("ideventos") int idevento);
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 2 and p.identificacao like '15%' or p.identificacao like '16%' and p.setor = 2")
	public List<Setor> findFrisa1516(@Param("ideventos") int idevento);
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 2 and p.identificacao like '17%' or p.identificacao like '18%' and p.setor = 2")
	public List<Setor> findFrisa1718(@Param("ideventos") int idevento);
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 2 and p.identificacao like '19%' or p.identificacao like '20%' and p.setor = 2")
	public List<Setor> findFrisa1920(@Param("ideventos") int idevento);
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 2 and p.identificacao like '21%' or p.identificacao like '22%' and p.setor = 2")
	public List<Setor> findFrisa2122(@Param("ideventos") int idevento);
	
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 3 and p.identificacao like '01%' or p.identificacao like '03%' and p.setor = 3")
	public List<Setor> findCamarote0103(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 3 and p.identificacao like '04%' or p.identificacao like '05%' and p.setor = 3")
	public List<Setor> findCamarote0405(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 3 and p.identificacao like '06%' or p.identificacao like '07%' and p.setor = 3")
	public List<Setor> findCamarote0607(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 3 and p.identificacao like '08%' or p.identificacao like '09%' and p.setor = 3")
	public List<Setor> findCamarote0809(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 3 and p.identificacao like '10%' or p.identificacao like '11%' and p.setor = 3")
	public List<Setor> findCamarote1011(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 3 and p.identificacao like '12%' or p.identificacao like '13%' and p.setor = 3")
	public List<Setor> findCamarote1213(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 3 and p.identificacao like '14%' or p.identificacao like '15%' and p.setor = 3")
	public List<Setor> findCamarote1415(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 3 and p.identificacao like '16%' or p.identificacao like '17%' and p.setor = 3")
	public List<Setor> findCamarote1617(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 3 and p.identificacao like '18%' or p.identificacao like '19%' and p.setor = 3")
	public List<Setor> findCamarote1819(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 3 and p.identificacao like '20%' or p.identificacao like 'cortesias%' and p.setor = 3")
	public List<Setor> findCamarote20ECortesias(@Param("ideventos") int idevento);
	
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 4 and p.identificacao like '01%' or p.identificacao like '02%' and p.setor = 4")
	public List<Setor> findBalcao0102(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 4 and p.identificacao like '03%' or p.identificacao like '04%' and p.setor = 4")
	public List<Setor> findBalcao0304(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 4 and p.identificacao like '05%' or p.identificacao like '06%' and p.setor = 4")
	public List<Setor> findBalcao0506(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 4 and p.identificacao like '07%' or p.identificacao like '08%' and p.setor = 4")
	public List<Setor> findBalcao0708(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 4 and p.identificacao like '09%' or p.identificacao like '10%' and p.setor = 4")
	public List<Setor> findBalcao0910(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 4 and p.identificacao like '11%' or p.identificacao like '12%' and p.setor = 4")
	public List<Setor> findBalcao1112(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 4 and p.identificacao like '13%' or p.identificacao like '14%' and p.setor = 4")
	public List<Setor> findBalcao1314(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 4 and p.identificacao like '15%' or p.identificacao like '16%' and p.setor = 4")
	public List<Setor> findBalcao1516(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 4 and p.identificacao like '17%' or p.identificacao like '18%' and p.setor = 4")
	public List<Setor> findBalcao1718(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 4 and p.identificacao like '19%' or p.identificacao like '20%' and p.setor = 4")
	public List<Setor> findBalcao1920(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 4 and p.identificacao like '21%' or p.identificacao like '22%' and p.setor = 4")
	public List<Setor> findBalcao2122(@Param("ideventos") int idevento);
	
	
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 5 and p.identificacao like '01%' or p.identificacao like '02%' and p.setor = 5")
	public List<Setor> findGaleria0102(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 5 and p.identificacao like '03%' or p.identificacao like '04%' and p.setor = 5")
	public List<Setor> findGaleria0304(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 5 and p.identificacao like '05%' or p.identificacao like '06%' and p.setor = 5")
	public List<Setor> findGaleria0506(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 5 and p.identificacao like '07%' or p.identificacao like '08%' and p.setor = 5")
	public List<Setor> findGaleria0708(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 5 and p.identificacao like '09%' or p.identificacao like '10%' and p.setor = 5")
	public List<Setor> findGaleria0910(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 5 and p.identificacao like '11%' or p.identificacao like '12%' and p.setor = 5")
	public List<Setor> findGaleria1112(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 5 and p.identificacao like '13%' or p.identificacao like '14%' and p.setor = 5")
	public List<Setor> findGaleria1314(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 5 and p.identificacao like '15%' or p.identificacao like '16%' and p.setor = 5")
	public List<Setor> findGaleria1516(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 5 and p.identificacao like '17%' or p.identificacao like '18%' and p.setor = 5")
	public List<Setor> findGaleria1718(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 5 and p.identificacao like '19%' or p.identificacao like '20%' and p.setor = 5")
	public List<Setor> findGaleria1920(@Param("ideventos") int idevento);
	@Query("select p from Setor p  where p.id not in (select u.id from Setor u join u.livro p join p.categorias c where c.id = :ideventos) and p.setor = 5 and p.identificacao like '21%' or p.identificacao like '22%' and p.setor = 5")
	public List<Setor> findGaleria2122(@Param("ideventos") int idevento);
}

