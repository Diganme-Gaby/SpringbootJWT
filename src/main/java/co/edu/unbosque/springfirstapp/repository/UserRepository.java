package co.edu.unbosque.springfirstapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.springfirstapp.model.User;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/**
 * Repositorio para la entidad User.
 * Proporciona operaciones CRUD básicas heredadas de JpaRepository
 * y métodos personalizados para buscar y eliminar usuarios por nombre de usuario
 * y por fecha de nacimiento.
 */
public interface UserRepository extends JpaRepository<User, Long> {

	/**
	 * Busca un usuario por su nombre de usuario.
	 * 
	 * @param username El nombre de usuario a buscar
	 * @return Un Optional que contiene el usuario si existe, o vacío si no existe
	 */
	public Optional<User> findByUsername(String username);

	/**
	 * Elimina un usuario por su nombre de usuario.
	 * 
	 * @param username El nombre de usuario del usuario a eliminar
	 */
	public void deleteByUsername(String username);

	/**
	 * Busca los usuarios que tienen una fecha de nacimiento específica.
	 *
	 * @param fechaNacimiento La fecha de nacimiento a buscar
	 * @return Lista de usuarios con esa fecha de nacimiento, vacía si no hay ninguno
	 */
	public List<User> findByFechaNacimiento(LocalDate fechaNacimiento);

	/**
	 * Elimina los usuarios que tienen una fecha de nacimiento específica.
	 *
	 * @param fechaNacimiento La fecha de nacimiento de los usuarios a eliminar
	 */
	public void deleteByFechaNacimiento(LocalDate fechaNacimiento);
}
